package ninja.oliverwerner.kassensystem;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class TablesActivity extends AppCompatActivity {

    ArrayList<Table> tableList = new ArrayList<>();

    // TODO: 01.12.2016 hier json übergeben
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tables);

        Bundle bundle = getIntent().getExtras();
        String topic = bundle.getString("topic");

        setTitle(topic);

        /*//Textfeld auf dem Layout
        final TextView textView = (TextView) findViewById(R.id.textView);

        Button loadTablesBtn = (Button) findViewById(R.id.loadTablesBtn);
        loadTablesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new ActivityDataSource(textView).execute("someParams");
            }
        });*/

        loadTables();
    }

    private void loadTables() {
        Log.d("myMessage", "loadTables()");


        final TextView textView = (TextView) new TextView(this);

        try {
            // Hole mir den Rückgabe-String und speicher ihn in einer Variable ab
            String jsonString = new ActivityDataSource(textView).execute("someParams").get();
            // Erstelle aus dem JSON-String ein JSONArray
            JSONArray jsonArray = new JSONArray(jsonString);

            for (int i = 0; i < jsonArray.length(); i++) {
                try {
                    // Hole aus dem JSONArray ein JSONObjekt und speicher die Daten in Variablen
                    JSONObject oneObject = jsonArray.getJSONObject(i);
                    int id = oneObject.getInt("ID");
                    String name = oneObject.getString("name");
                    int status = oneObject.getInt("status");
                    // Füge die Daten aus dem JSONObjekt in die Erstellung eines neuen Tisches ein und hänge diesen an die Liste an
                    tableList.add(new Table(id, name, status));
                    Log.d("myMessage", "ID->" + id + " | name->" + name + " | status->" + status);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // TODO: 02.12.2016 Adapter schreiben der mit Table-Objekten umgehen kann
        GridView gvTables = (GridView) findViewById(R.id.gvTables);
        TableGridAdapter adapter = new TableGridAdapter(this, R.layout.simple_button_layout, tableList);
//        CustomeGridAdapter customeGridAdapter = new CustomeGridAdapter(this, R.layout.simple_button_layout, tableList);
        gvTables.setAdapter(adapter);
    }
}
