/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author Andrea Joyce Sequeira
 */
public class DeliveryPackage {

    int packageId;
    double packageWeight;
    ArrayList<Product> productList;
    Customer customer;

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryPackage() {
        this.packageId=0;
        this.packageWeight=0;
        this.customer = new Customer();
        this.productList = new ArrayList<Product>();
    }
    public Product createProduct(int productId, String productName, double price) {
        Product product = new Product(); //create a new product object
        //set the attributes
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        this.productList.add(product);
        return product;
    }
    
    public Product findProduct(int pid) {
        for (Product prod : this.productList) {
            if (prod.getProductId() == pid) {
                return prod;
            }
        }
        return null;
    }

}
