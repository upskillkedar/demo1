package com.example.demo.com.example.service;

import com.example.demo.dao.CustomerRatingDao;
import com.example.demo.models.CustomerRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerRatingService {

    @Autowired
    // autowire CustomerRatingDao instead of creating object
    private CustomerRatingDao customerRatingDao;

    //define a method to get  CustomerRating
    public CustomerRating getCustomerRating() {
        //get CustomerRating from dao
        return customerRatingDao.getCustomerRating();
    }
}