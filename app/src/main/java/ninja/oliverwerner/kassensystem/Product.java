package ninja.oliverwerner.kassensystem;

/**
 * Created by Oliver on 20.11.2016.
 */
//todo Klasse einbauen in den Programm-Ablauf
// TODO: 21.11.2016 ProduktNummer (ID) hinzufügen
public class Product {

    private String productName;
    private String productCategory;
    private double productPrice;
    private int productId;

    public Product(int productId, String productName, String productCategory, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
