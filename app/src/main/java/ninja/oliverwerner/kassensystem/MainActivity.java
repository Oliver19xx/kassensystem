package ninja.oliverwerner.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String[] queryButtons(){
        String[] buttonArray = {
                "Getränke",
                "Vorspeisen",
                "Hauptspeisen",
                "Nachtisch"
        };
        return buttonArray;
    }

    private void generateButtons(){
        String[] buttonNameArray = queryButtons();
        Button[] buttonArray = new Button[buttonNameArray.length];
        GridView gridView = (GridView) findViewById(R.id.gridView);

        for (int i = 0; i < buttonArray.length; i++){

            Button btn = new Button(this);

            btn.setText(buttonNameArray[i]);
            btn.setLayoutParams(new GridLayout.LayoutParams());
            btn.setMaxWidth(50);
            btn.setMaxHeight(50);
            btn.setPadding(10, 10, 10, 10);
            gridView.addView(btn, i);
        }

        ArrayAdapter adapter = new ArrayAdapter(this,buttonArray);
        return;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateButtons();
    }
}
