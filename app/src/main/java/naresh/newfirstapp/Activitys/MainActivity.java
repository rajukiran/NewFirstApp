package naresh.newfirstapp.Activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import naresh.newfirstapp.Models.TableDetails;
import naresh.newfirstapp.R;
import naresh.newfirstapp.Tasks.Task;
import naresh.newfirstapp.callbacks.TableDetailsCallback;

public class MainActivity extends AppCompatActivity implements TableDetailsCallback{

    Button button;
    String LinkURL = "http://128.199.203.43:8080/SpringWithHibernate/getUserStatistics.do";

    EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                fetchDetails();
            }

        });

    }

    protected void fetchDetails(){
        Task t = new Task(this, LinkURL);
        t.execute();
    }

    @Override
    public void onSuccess(TableDetails object) {

        e1 = (EditText) findViewById(R.id.f1);
        e2 = (EditText) findViewById(R.id.f2);
        e3 = (EditText) findViewById(R.id.f3);
        e4 = (EditText) findViewById(R.id.f4);

        e1.setText(String.valueOf(object.getAndroidUsers()));
        e2.setText(String.valueOf(object.getConsumersCount()));
        e3.setText(String.valueOf(object.getFarmersCount()));
        e4.setText(String.valueOf(object.getHappyPeople()));
    }
}
