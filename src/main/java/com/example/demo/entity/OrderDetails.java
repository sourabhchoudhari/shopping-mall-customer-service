package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class OrderDetails {

    @Id
    private int id;

    private LocalDateTime dateOfPurchase;
    private float total;
    private String paymentMode;

    public OrderDetails() {
    }

    public OrderDetails(int id, LocalDateTime dateOfPurchase,
                        float total, String paymentMode) {
        this.id = id;
        this.dateOfPurchase = dateOfPurchase;
        this.total = total;
        this.paymentMode = paymentMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(LocalDateTime dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}