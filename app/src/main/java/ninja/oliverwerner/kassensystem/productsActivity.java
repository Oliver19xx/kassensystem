package ninja.oliverwerner.kassensystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class productsActivity extends AppCompatActivity {

    private ArrayList<Product> productList = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        Bundle bundle = getIntent().getExtras();
        String topic = bundle.getString("topic");

        setTitle(topic);
        loadProducts();
        showProducts();
    }

    public void showProducts(){
        ListView listView = (ListView) findViewById(R.id.lwProducts);

        // TODO: 20.11.2016 Adapter fertigstellen mit einer Liste von Product-Objekten
        CustomeProductListAdapter customeProductListAdapter = new CustomeProductListAdapter(this,productList);

        listView.setAdapter(customeProductListAdapter);
    }
    private void loadProducts(){
        productList.add(new Product(001,"Coca-Cola 0,5l","Getränke",1.25));
        productList.add(new Product(002,"Fanta 0,5l","Getränke",1.0));
        productList.add(new Product(003,"Sprite 0,5l","Getränke",1.0));
        productList.add(new Product(004,"Steak 300g","Essen",11.50));
    }
}
