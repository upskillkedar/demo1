package com.example.demo.models;

public class CustomerRating {
    private String customerName;
    private int rating;

    //define customerId
    private int customerId;

    //define setters and getters for customerId
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CustomerRating(String customerName, int rating) {
        this.customerName = customerName;
        this.rating = rating;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRating() {
        return rating;
    }

    //define setters for customerName and rating
    public void setRating(int rating) {
        this.rating = rating;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    //define method to validate rating
    public boolean validateRating() {
        return rating >= 1 && rating <= 5;
    }

}
