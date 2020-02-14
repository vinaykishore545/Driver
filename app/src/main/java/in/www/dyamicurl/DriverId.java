package in.www.dyamicurl;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverId {
    @SerializedName("response")
    @Expose
    private Integer response;
    @SerializedName("order_id")
    @Expose
    private String orderId;
    @SerializedName("message")
    @Expose
    private String message;

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
