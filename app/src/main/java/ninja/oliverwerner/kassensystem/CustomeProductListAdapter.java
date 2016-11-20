package ninja.oliverwerner.kassensystem;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CustomeProductListAdapter extends ArrayAdapter<Product> {

    public CustomeProductListAdapter(Context context, ArrayList<Product> products){
        // TODO: 20.11.2016 Was genau macht usper?
        super(context,0,products);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO: 20.11.2016 Aus der Produkt-Objekt einen Listeneintrag machen. 
        return super.getView(position, convertView, parent);
    }
}
