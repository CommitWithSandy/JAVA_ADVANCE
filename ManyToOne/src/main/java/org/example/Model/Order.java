package org.example.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_order")
public class Order {

    @Id
    private int orderId;

    private String productName;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order() {
    }

    public Order(int orderId, String productName, Customer customer) {
        this.orderId = orderId;
        this.productName = productName;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}