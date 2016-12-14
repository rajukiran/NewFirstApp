package naresh.newfirstapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Pojo {

    @SerializedName("message")
    @Expose
    private TableDetails message;
    @SerializedName("status")
    @Expose
    private Boolean status;

    /**
     *
     * @return
     * The message
     */
    public TableDetails getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(TableDetails message) {
        this.message = message;
    }

    /**
     *
     * @return
     * The status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

}
