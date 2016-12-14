package naresh.newfirstapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TableDetails
{
    @SerializedName("consumersCount")
    @Expose
    private Integer consumersCount;
    @SerializedName("happyPeople")
    @Expose
    private Integer happyPeople;
    @SerializedName("androidUsers")
    @Expose
    private Integer androidUsers;
    @SerializedName("farmersCount")
    @Expose
    private Integer farmersCount;
    @SerializedName("webUsers")
    @Expose
    private Integer webUsers;

    /**
     *
     * @return
     * The consumersCount
     */
    public Integer getConsumersCount() {
        return consumersCount;
    }

    /**
     *
     * @param consumersCount
     * The consumersCount
     */
    public void setConsumersCount(Integer consumersCount) {
        this.consumersCount = consumersCount;
    }

    /**
     *
     * @return
     * The happyPeople
     */
    public Integer getHappyPeople() {
        return happyPeople;
    }

    /**
     *
     * @param happyPeople
     * The happyPeople
     */
    public void setHappyPeople(Integer happyPeople) {
        this.happyPeople = happyPeople;
    }

    /**
     *
     * @return
     * The androidUsers
     */
    public Integer getAndroidUsers() {
        return androidUsers;
    }

    /**
     *
     * @param androidUsers
     * The androidUsers
     */
    public void setAndroidUsers(Integer androidUsers) {
        this.androidUsers = androidUsers;
    }

    /**
     *
     * @return
     * The farmersCount
     */
    public Integer getFarmersCount() {
        return farmersCount;
    }

    /**
     *
     * @param farmersCount
     * The farmersCount
     */
    public void setFarmersCount(Integer farmersCount) {
        this.farmersCount = farmersCount;
    }

    /**
     *
     * @return
     * The webUsers
     */
    public Integer getWebUsers() {
        return webUsers;
    }

    /**
     *
     * @param webUsers
     * The webUsers
     */
    public void setWebUsers(Integer webUsers) {
        this.webUsers = webUsers;
    }
}
