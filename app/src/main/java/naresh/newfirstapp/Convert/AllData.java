package naresh.newfirstapp.Convert;

import android.app.ActionBar;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import naresh.newfirstapp.Models.Pojo;
import naresh.newfirstapp.Models.TableDetails;

import static android.R.attr.data;

/**
 * Created by Naresh on 14-12-2016.
 */

public class AllData
{
//    Pojo pojo = new Pojo();

    JSONObject message;


    public Pojo getData(JSONObject ja)
    {
        Log.d("In AllData","getdata method exicuted");

            Pojo pj = new Pojo();

        TableDetails td = new TableDetails();

            try {

                message = ja.getJSONObject("message");

                pj.setStatus(ja.getBoolean("status"));

                Log.d("AllData", "" + message.getInt("consumersCount"));

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
