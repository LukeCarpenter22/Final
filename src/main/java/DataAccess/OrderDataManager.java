/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import OrderSystem.Order;
import java.util.ArrayList;

/**
 *
 * @author Luke
 */
public class OrderDataManager {
    private ArrayList<Order> dataStore;
    
    public OrderDataManager() {
        this.dataStore = new ArrayList<Order>();
    }
    public ArrayList<Order> getAll() {
        return dataStore;
    }
    public void create(Order orderToCreate) {
        this.dataStore.add(orderToCreate);
    }
}
