package ninja.oliverwerner.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    static final String[] menuItems = new String[]{
            "Getränke",
            "menu-item 2",
            "menu-item 3",
            "menu-item 4",
            "menu-item 5",
            "menu-item 6",
            "menu-item 7",
            "menu-item 8",
            "menu-item 9",
            "menu-item 10",
            "menu-item 11",
            "menu-item 12",
            "menu-item 13",
            "menu-item 14",
            "menu-item 15",
            "menu-item 16",
            "menu-item 17",
            "menu-item 18",
            "menu-item 19",
            "menu-item 20",
            "menu-item 21"
    };

    private void showMenu(String[] menuItems){

        GridView gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(new ButtonAdapter(this, menuItems));

        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMenu(menuItems);
    }
}
