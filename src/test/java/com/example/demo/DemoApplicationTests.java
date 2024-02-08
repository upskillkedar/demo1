package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	//add test method to test getCustomerRating method of CustomerRatingController
	@Test
	public void testGetCustomerRating() {
		CustomerRatingController customerRatingController = new CustomerRatingController();
		Assertions.assertEquals("John", customerRatingController.getCustomerRating().getCustomerName());
		Assertions.assertEquals(5, customerRatingController.getCustomerRating().getRating());

	}
}
