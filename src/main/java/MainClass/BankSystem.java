/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import DataAccess.CustomerDataManager;
import DataAccess.OrderDataManager;
import DataAccess.OrderItemDataManager;
import DataAccess.ProductDataManager;
import OrderSystem.Customer;
import OrderSystem.Order;
import OrderSystem.OrderItem;
import OrderSystem.Product;
import java.util.ArrayList;
import java.util.Date;



/**
 *
 * @author Luke
 */
public class BankSystem {
    public static void main(String[] args) {
        
        CustomerDataManager customerDM = new CustomerDataManager();
        OrderDataManager orderDM = new OrderDataManager();
        OrderItemDataManager orderItemDM = new OrderItemDataManager();
        ProductDataManager productDM = new ProductDataManager();
        
        Product product1 = new Product(1, "Basketball", 5.00,100);
        Product product2 = new Product(2, "Baseball", 2.00,100);
        Product product3 = new Product(3, "Football", 10.00,100);
        
        Customer customer1 = new Customer(1, "Luke", "Carpenter", "9134150394"); 
        Customer customer2 = new Customer(2, "Jake", "Smith", "9132344334");
        Customer customer3 = new Customer(3, "Ben", "Morgan", "9134300659");
        
        Order order1 = new Order(1,1, new Date());
        
        OrderItem transaction1 = new OrderItem(1,1,1,"Basketball",3,15.00);
        OrderItem transaction2 = new OrderItem(1,1,2,"Baseball",1,2.00);
        
        Order order2 = new Order(2,2, new Date());
        
        OrderItem transaction3 = new OrderItem(2,2,3, "Football", 5, 50.00);
        OrderItem transaction4 = new OrderItem(2,2,2, "Baseball", 5, 10.00);
        
        Order order3 = new Order(3,3, new Date());
        
        OrderItem transaction5 = new OrderItem(3,3,1, "Basketball", 5, 25.00);
        OrderItem transaction6 = new OrderItem(3,3,3, "Football", 1, 10.00);
        
        customerDM.create(customer1);
        customerDM.create(customer2);
        customerDM.create(customer3);
        orderDM.create(order1);
        orderDM.create(order2);
        orderDM.create(order3);
        orderItemDM.create(transaction1);
        orderItemDM.create(transaction2);
        orderItemDM.create(transaction3);
        orderItemDM.create(transaction4);
        orderItemDM.create(transaction5);
        orderItemDM.create(transaction6);
        productDM.create(product1);
        productDM.create(product2);
        productDM.create(product3);
        
        System.out.println("\nDatabase Customers:");
        ArrayList<Customer> customersFromDatabase = customerDM.getAll();
        for (Customer dbCustomer : customersFromDatabase) {
            System.out.println(dbCustomer);
        }
        System.out.println("\nDatabase Orders:");
        ArrayList<Order> orderFromDatabase = orderDM.getAll();
        for (Order dbOrder : orderFromDatabase) {
            System.out.println(dbOrder);
        }
        System.out.println("\nDatabase Transactions:");
        ArrayList<OrderItem> orderItemFromDatabase = orderItemDM.getAll();
        for (OrderItem dbOrderItem: orderItemFromDatabase) {
            System.out.println(dbOrderItem);
        }
        System.out.println("\nDatabase Products:");
        ArrayList<Product> productFromDatabase = productDM.getAll();
        for (Product dbProduct: productFromDatabase) {
            System.out.println(dbProduct);
        }
    }
}
