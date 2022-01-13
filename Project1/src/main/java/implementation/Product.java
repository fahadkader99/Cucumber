package implementation;

// let's say this is the implementation how the real code will be.
import java.util.ArrayList;
import java.util.List;

public class Product {

    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProductList(){   // this method returns the productLists

        List<String> productList = new ArrayList<>();
        productList.add("Apple MacBook Pro");
        productList.add("Apple MacBook Air");
        productList.add("Apple iPhone 13");

        return productList;
    }

}
