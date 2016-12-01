package ninja.oliverwerner.kassensystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    static final String[] menu_items = new String[] {"Tische","Produkte","Einstellungen","Test"};
    public static final String TAG = "myMessage";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"MainActivity - onCreate()");

        //# Array mit Menüpunkten vorbereiten (Array -> ArrayList)
        // ArrayList erstellen zum wandel eines Arrays in eine Liste
        ArrayList<String> arrayList = new ArrayList<>();

        // Array in ArrayList laden
        for (int i = 0; i < menu_items.length ; i++){
            arrayList.add(menu_items[i]);
        }

        //# ListView erstellen und anzeigen
        ListView listView = (ListView) findViewById(R.id.lvMain);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.simple_button_layout, arrayList);
        listView.setAdapter(arrayAdapter);




        //# GridView erstellen und anzeigen
        // GridView aus dem Layout-Verzeichniss als Objekt laden
        GridView gridView = (GridView) findViewById(R.id.gvMain);


        // CustomeGridAdapter erstellen mit den Daten der ArrayList
        CustomeGridAdapter customeGridAdapter = new CustomeGridAdapter(this,0,arrayList);

        // Die geladene GridView mit dem erstellten CustomeGridAdapter rendern
        gridView.setAdapter(customeGridAdapter);

    }

    public void startNextActivity(View view)
    {
        // Erstelle ein Paket zum Übertragen der Daten
        Bundle bundle = new Bundle();

        // Parke den Text des Buttons in eine Variable
        String string = ((Button) view).getText().toString();

        // Füge den String dem Übergabepaket hinzu.
        bundle.putString("topic",string);

        // Starte die neue Activity
        Class aClass;
        switch (string){
            case "Tische":
                aClass = TablesActivity.class;
                break;
            case "Produkte":
                aClass = ProductsActivity.class;
                break;
            case "Einstellungen":
                aClass = SettingsActivity.class;
                break;
            default:
                Toast.makeText(this,"\"" + string +"\" not found", Toast.LENGTH_SHORT).show();
                aClass = MainActivity.class;
        }
        Intent intent = new Intent(this, aClass);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
