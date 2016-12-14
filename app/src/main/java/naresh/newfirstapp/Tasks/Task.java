package naresh.newfirstapp.Tasks;

import android.app.ActionBar;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import naresh.newfirstapp.Convert.AllData;
import naresh.newfirstapp.JsonURL.Link;
import naresh.newfirstapp.Models.Pojo;
import naresh.newfirstapp.Models.TableDetails;

/**
 * Created by Naresh on 14-12-2016.
 */

public class Task extends AsyncTask<Object, Object, JSONObject>
{

    String LinkUr;
    Pojo pojoDetails;
    TableDetails tableDetails;
    AllData allData;
    public Task(String Link)
    {
        Link = LinkUr;

    }

    @Override
    protected JSONObject doInBackground(Object... voids)
    {
        JSONObject ja = Link.requestJSON(LinkUr, null);

        Log.d("Don in Background","Array of items exicuted");
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

        Log.d("Post Execute", "Post execute completd" + tableDetails.getAndroidUsers());

    }
}
