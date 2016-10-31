package ninja.oliverwerner.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        String[] buttonArray = queryButtons();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateButtons();
    }
}
