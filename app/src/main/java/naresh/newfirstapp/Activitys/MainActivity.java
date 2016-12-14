package naresh.newfirstapp.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import naresh.newfirstapp.R;
import naresh.newfirstapp.Tasks.Task;

public class MainActivity extends AppCompatActivity {

    Button button;
    String LinkURL = "http://128.199.203.43:8080/SpringWithHibernate/getUserStatistics.do";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Task t = new Task(LinkURL);
                t.execute();
            }
        });

    }
}
