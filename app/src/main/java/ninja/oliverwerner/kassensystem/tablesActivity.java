package ninja.oliverwerner.kassensystem;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TablesActivity extends AppCompatActivity {

    String[] tables = {"Tisch1","Tisch2","Tisch3","Tisch4","Tisch5","Tisch6","Tisch7","Tisch8","Tisch9","Tisch10","Tisch11","Tisch12","Tisch13","Tisch14"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        Bundle bundle = getIntent().getExtras();
        String topic = bundle.getString("topic");

        setTitle(topic);

        loadTables();
    }

    private void loadTables(){

        ArrayList<String> tableList = new ArrayList<>();
        for (int i = 0; i < tables.length ; i++){
            tableList.add(tables[i]);
        }

        GridView gridView = (GridView) findViewById(R.id.gvTables);
        CustomeGridAdapter customeGridAdapter = new CustomeGridAdapter(this,R.layout.simple_button_layout,tableList);
        gridView.setAdapter(customeGridAdapter);
    }
}
