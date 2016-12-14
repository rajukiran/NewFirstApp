package naresh.newfirstapp.Tasks;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import naresh.newfirstapp.Convert.AllData;
import naresh.newfirstapp.JsonURL.Link;
import naresh.newfirstapp.Models.Pojo;
import naresh.newfirstapp.Models.TableDetails;
import naresh.newfirstapp.callbacks.TableDetailsCallback;

/**
 * Created by Naresh on 14-12-2016.
 */

public class Task extends AsyncTask<Object, Object, JSONObject>
{

    String LinkUr;
    Pojo pojoDetails;
    TableDetails tableDetails;
    AllData allData;
    TableDetailsCallback callback;
    public Task(TableDetailsCallback callback, String Link)
    {
        LinkUr = Link;
        this.callback = callback;

    }



    @Override
    protected JSONObject doInBackground(Object... voids)
    {
        JSONObject ja = Link.requestJSON(LinkUr);

        try {
            Log.d("Don in Background","Array of items exicuted" + ja.getBoolean("status"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return ja;
    }

    @Override
    protected void onPostExecute(JSONObject ja)
    {
        super.onPostExecute(ja);
        allData = new AllData();
        tableDetails = new TableDetails();
        pojoDetails = allData.getData(ja);
        tableDetails = pojoDetails.getMessage();
        callback.onSuccess(tableDetails);
    }
}
