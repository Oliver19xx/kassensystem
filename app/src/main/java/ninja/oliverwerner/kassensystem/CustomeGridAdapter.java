package ninja.oliverwerner.kassensystem;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Oliver on 07.11.2016.
 */

public class CustomeGridAdapter extends ArrayAdapter {

    private Context context;
    private  ArrayList<String> arrayList;

    public CustomeGridAdapter(Context context, int resource, ArrayList<String> arrayList) {
        super(context, resource, arrayList);

        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(MainActivity.TAG,"CustomeGridAdapter - getView - "+position);
        Button button;

        if (convertView == null){
            button = new Button(parent.getContext());
            button.setText(arrayList.get(position));
        } else {
            button = (Button) convertView;
        }

        button.setId(position);

        /*button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
//                Toast.makeText(view.getContext(),((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), TablesActivity.class);
                context.startActivity(intent);
            }
        });*/

        return button;
    }


}