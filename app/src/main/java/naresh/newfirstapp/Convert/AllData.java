package naresh.newfirstapp.Convert;

import org.json.JSONException;
import org.json.JSONObject;

import naresh.newfirstapp.Models.Pojo;
import naresh.newfirstapp.Models.TableDetails;

/**
 * Created by Naresh on 14-12-2016.
 */

public class AllData {
    JSONObject message;
    public Pojo getData(JSONObject ja) {
        Pojo pj = new Pojo();
        TableDetails td = new TableDetails();
        try {
            message = ja.getJSONObject("message");
            pj.setStatus(ja.getBoolean("status"));
            td.setConsumersCount(message.getInt("consumersCount"));
            td.setHappyPeople(message.getInt("happyPeople"));
            td.setAndroidUsers(message.getInt("androidUsers"));
            td.setFarmersCount(message.getInt("farmersCount"));
            td.setWebUsers(message.getInt("webUsers"));
            pj.setMessage(td);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return pj;
    }
}
