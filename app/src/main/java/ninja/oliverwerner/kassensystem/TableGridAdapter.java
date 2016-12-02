package ninja.oliverwerner.kassensystem;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oliver on 02.12.2016.
 */

public class TableGridAdapter extends ArrayAdapter<Table> {

    private Context context;
    private ArrayList<Table> arrayList;

    public TableGridAdapter(Context context, int resource, ArrayList<Table> arrayList) {
        super(context, resource, arrayList);
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Button button;
        Table table = getItem(position);

        if (convertView == null) {
            button = new Button(parent.getContext());
            // TODO: 02.12.2016 wo speichere ich die ID des Tisches?
            String btnText = table.getTableName();
            Log.d("myMessage", btnText + " - " + position);
            button.setText(btnText);
        } else {
            button = (Button) convertView;
        }

        button.setId(position);

        return button;
    }
}
