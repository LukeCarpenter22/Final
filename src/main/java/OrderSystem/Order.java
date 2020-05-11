package OrderSystem;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luke
 */
public class Order {
    private int orderNumber;
    private int customerID;
    private Date date;
    
    public Order(int orderNumber, int customerID, Date date) {
        this.orderNumber = orderNumber;
        this.customerID = customerID;
        this.date = date;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Order{" + " Order Number: " + orderNumber + " |" + " Customer ID: " + customerID + " |" + " Date: " + date + '}';
    }
}
