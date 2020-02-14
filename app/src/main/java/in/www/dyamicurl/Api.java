package in.www.dyamicurl;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface Api {


   @FormUrlEncoded
    @POST("order")
    Call<List<DriverId>>creatOrder(
            @Field("user_id") String id,
            @Field("pickup") String pickcar,
            @Field("drop") String drop,
            @Field("service_id") String service_id,
            @Field("date") String date,
            @Field("time") String time,
            @Field("duration") String duration,
            @Field("car_name") String car_name,
            @Field("car_number") String car_number,
            @Field("car_type") String car_type,
            @Field("car_location") String car_location,
            @Field("price") String price
    );
   @FormUrlEncoded
    @POST("")
    Call<List<Example>>creatDriver(@Url String url, @Field("user_id") String id);


   /* @POST
    Call<List<DriverId>>creatDriver(@Url String url,
             @Field("user_id") String id
    );*/

}
