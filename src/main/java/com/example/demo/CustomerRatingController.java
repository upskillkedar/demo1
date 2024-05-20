package com.example.demo;

import com.example.demo.com.example.service.CustomerRatingService;
import com.example.demo.models.CustomerRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRatingController {

    @Autowired
    private CustomerRatingService customerRatingService;

    //define a method to get  CustomerRating
    @RequestMapping("/getCustomerRating")
    public CustomerRating getCustomerRating() {
        //get CustomerRating from CustomerRatingService
        return customerRatingService.getCustomerRating();
    }

}
