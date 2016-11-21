package ninja.oliverwerner.kassensystem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomeProductListAdapter extends ArrayAdapter<Product> {

    private String productName;
    private int productId;
    private String productCategory;
    private double productPrice;

    public CustomeProductListAdapter(Context context, ArrayList<Product> products){
        // TODO: 20.11.2016 Was genau macht usper?
        super(context,0,products);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO: 20.11.2016 Aus der Produkt-Objekt einen Listeneintrag machen.

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.product_list_item,parent,false);
        }

        Product product = getItem(position);
        int productId = product.getProductId();
        String productName = product.getProductName();
        String productCategory = product.getProductCategory();
        double productPrice = product.getProductPrice();

        TextView tvproductName = (TextView) convertView.findViewById(R.id.productName);
        TextView tvproductCategory = (TextView) convertView.findViewById(R.id.productCategory);
        TextView tvproductPrice = (TextView) convertView.findViewById(R.id.productPrice);

        tvproductName.setText(productName);
        tvproductCategory.setText(productCategory);
        tvproductPrice.setText(String.valueOf(productPrice));

        return convertView;
    }
}
