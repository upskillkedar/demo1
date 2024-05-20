package com.example.demo.dao;

import com.example.demo.models.CustomerRating;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRatingDao {
    //define a method to return sample CustomerRating object
    public CustomerRating getCustomerRating() {
        return new CustomerRating("John", 5);
    }



}
