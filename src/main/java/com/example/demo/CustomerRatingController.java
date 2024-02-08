package com.example.demo;

import com.example.demo.dao.CustomerRatingDao;
import com.example.demo.models.CustomerRating;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRatingController {

    //define a method to get  CustomerRating
    @RequestMapping("/getCustomerRating")
    public CustomerRating getCustomerRating() {
        //get CustomerRating from dao
        CustomerRatingDao customerRatingDao = new CustomerRatingDao();
        return customerRatingDao.getCustomerRating();
    }

}
