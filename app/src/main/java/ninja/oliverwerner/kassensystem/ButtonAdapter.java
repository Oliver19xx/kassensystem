package ninja.oliverwerner.kassensystem;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ButtonAdapter extends BaseAdapter {
    private Context context;
    private final String[] textViewValues;


    public ButtonAdapter(Context context, String[] textViewValues) {
        this.context = context;
        this.textViewValues = textViewValues;
    }


    public View getView(int position, final View convertView, ViewGroup parent) {

        // LayoutInflater is required for adding a view to an other view
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Load Context as a new View
        View defaultMenuButton =  new View(context);


        // get xml-layout to inflate
        defaultMenuButton = inflater.inflate(R.layout.defaultmenubutton, null);


        // set value into textview
        TextView textView= (TextView) defaultMenuButton.findViewById(R.id.defaultMenuButton);
        textView.setText(textViewValues[position]);

        return defaultMenuButton;
    }

    /*
    - create a new error-message
    - set error-message
    - show error-message
    @return error-message
     */
    /*public void alert(){
        AlertDialog alertDialog = new AlertDialog.Builder();
        alertDialog.setTitle("Titel");
        alertDialog.setMessage("Nachricht");
        alertDialog.show();
    }*/

    @Override
    public int getCount()		{
        return textViewValues.length;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }




}
