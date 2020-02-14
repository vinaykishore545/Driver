package in.www.dyamicurl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {
    static String tx;
    EditText id,price,serid,pickup,pickin,drop,duration,number,type,location,date,time,name;
    private Api apiInterface;
    String st="order";
    static String id1;
    @Override
         protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         id=findViewById(R.id.id);
         price=findViewById(R.id.price);
         serid=findViewById(R.id.service_id);
         pickin=findViewById(R.id.drop);
         pickup=findViewById(R.id.pick_up);
         number=findViewById(R.id.car_number);
         name=findViewById(R.id.car_name);
         type=findViewById(R.id.car_type);
         date=findViewById(R.id.date);
         time=findViewById(R.id.time);
         duration=findViewById(R.id.duration);
         location =findViewById(R.id.car_loction);
         Button ok=findViewById(R.id.butb);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 id1=id.getText().toString().trim();
                String date2 = date.getText().toString().trim();
                String time2 = time.getText().toString().trim();
                String duration2 = duration.getText().toString().trim();
                String address2 =location.getText().toString().trim();
                String type1 = type.getText().toString().trim();
                String cost2 = price.getText().toString().trim();
                String car_pick2 =pickin.getText().toString().trim();
                String car_drop2 =pickup.getText().toString().trim();
                String carnumber = number.getText().toString().trim();
                String driver_name = name.getText().toString().trim();
                String serv_id = serid.getText().toString().trim();
                apiInterface = ApiClient.getClient().create(Api.class);
                Call<List<DriverId>> userCall = apiInterface.creatOrder(id1, car_pick2, car_drop2, serv_id, date2, time2, duration2, driver_name, carnumber, type1, address2, cost2);
                userCall.enqueue(new Callback<List<DriverId>>() {
                    @Override
                    public void onResponse(Call<List<DriverId>> call, Response<List<DriverId>> response) {
                        tx=response.body().get(0).getOrderId();
                        String tx2=tx.trim();
                        Toast.makeText(MainActivity.this,response.body().get(0).getOrderId(),Toast.LENGTH_SHORT).show();
                       Intent i =new Intent(MainActivity.this,BookingActivity.class);
                        startActivity(i);
                        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putString("key_id",id1);
                        editor.putString("key",tx2);
                        editor.apply();
                    }
                    @Override
                    public void onFailure(Call<List<DriverId>> call, Throwable t) {
                        Toast.makeText(getApplicationContext(),"wrong",Toast.LENGTH_SHORT).show();

                    }
                });
            }
        });
    }
    /*public static String getText(){
        String data = tx.trim();
        return data;
    }*/
}
