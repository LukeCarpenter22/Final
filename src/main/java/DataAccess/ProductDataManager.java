/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import OrderSystem.Product;
import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class ProductDataManager {
    private ArrayList<Product> dataStore;
    
    public ProductDataManager() {
        this.dataStore = new ArrayList<Product>();
    }
    public ArrayList<Product> getAll() {
        return dataStore;
    }
    public void create(Product productToCreate) {
        this.dataStore.add(productToCreate);
    }
}
