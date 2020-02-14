package in.www.dyamicurl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingActivity extends AppCompatActivity {
    TextView serid,location,name,drid;
    private Api apiInterface;
    private List<Example> dataArrayList;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        /*String name=i.getStringExtra("id");
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();*/
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String name=preferences.getString("key_id",null);
        String data=preferences.getString("key",null);
        Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
        serid=findViewById(R.id.service_id);
        location=findViewById(R.id.car_loction);
        serid.setText(data);
        drid=findViewById(R.id.drvid);
        drid.setText(name);
        String id=drid.getText().toString().trim();
        String str=serid.getText().toString().trim();
        String ser="DRIVA53062";
        String com="order/booking/"+str;
        Api service = ApiClient.getClient().create(Api.class);
        Call<List<Example>> userCall=service.creatDriver(com,id);
        userCall.enqueue(new Callback<List<Example>>() {
            @Override
            public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
                if(response.body().get(0).getResponse()==1)
                {
                    Toast.makeText(BookingActivity.this,response.body().get(0).getOrder().getCarName(),Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(BookingActivity.this,"fail",Toast.LENGTH_SHORT).show();

                }

            }

            @Override
            public void onFailure(Call<List<Example>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });


    }
}
