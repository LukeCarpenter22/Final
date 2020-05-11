/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import OrderSystem.OrderItem;
import java.util.ArrayList;


/**
 *
 * @author Luke
 */
public class OrderItemDataManager {
    private ArrayList<OrderItem> dataStore;
    
    public OrderItemDataManager() {
        dataStore = new ArrayList<OrderItem>();
    }
    public ArrayList<OrderItem> getAll() {
        return dataStore;
    }
    public void create(OrderItem orderItemToCreate) {
        this.dataStore.add(orderItemToCreate);
    }
}
