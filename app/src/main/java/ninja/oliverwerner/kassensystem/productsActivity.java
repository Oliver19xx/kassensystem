package ninja.oliverwerner.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductsActivity extends AppCompatActivity {

    static final String[] prductItems = new String[] {"Pommes","Cola","Burger","Fanta","Salat","Gurken","Cola","Burger","Fanta","Salat","Gurken","Cola","Burger","Fanta","Salat","Gurken","Cola","Burger","Fanta","Salat","Gurken","Cola","Burger","Fanta","Salat","Gurken","Cola","Burger","Fanta","Salat","Gurken"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        Bundle bundle = getIntent().getExtras();
        String topic = bundle.getString("topic");

        setTitle(topic);

        showProducts();
    }

    public void showProducts(){
        ListView listView = (ListView) findViewById(R.id.lwProducts);

        ArrayList<Product> arrayList = new ArrayList<>();
        for (int i = 0; i < prductItems.length ; i++){
            arrayList.add(new Product(prductItems[i],"Category",0.00));
        }

        // TODO: 20.11.2016 Adapter fertigstellen mit einer Liste von Product-Objekten
        CustomeProductListAdapter customeProductListAdapter = new CustomeProductListAdapter(this,arrayList);

        listView.setAdapter(customeProductListAdapter);
    }
}
