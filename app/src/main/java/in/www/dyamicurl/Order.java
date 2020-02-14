package in.www.dyamicurl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Order {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("driver_id")
    @Expose
    private String driverId;
    @SerializedName("pickup_location")
    @Expose
    private String pickupLocation;
    @SerializedName("drop_location")
    @Expose
    private String dropLocation;
    @SerializedName("service_id")
    @Expose
    private String serviceId;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("car_name")
    @Expose
    private String carName;
    @SerializedName("car_number")
    @Expose
    private String carNumber;
    @SerializedName("car_type")
    @Expose
    private String carType;
    @SerializedName("car_location")
    @Expose
    private String carLocation;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("createddate")
    @Expose
    private String createddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarLocation() {
        return carLocation;
    }

    public void setCarLocation(String carLocation) {
        this.carLocation = carLocation;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

}
