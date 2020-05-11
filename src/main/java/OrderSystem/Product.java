/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderSystem;

/**
 *
 * @author Luke
 */
public class Product {
    private int productID;
    private String description;
    private double price;
    private int quantity;
    
    public Product(int productID, String description, double price, int quantity){
        this.productID = productID;
        this.description = description;
        this.price = price;
        this.quantity = quantity;               
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Product{" + " Product ID: " + productID + " |" + " Description: " + description + " |" + " Price: " + price + " |" + " Quantity: " + quantity
                + '}';
    }        
}
