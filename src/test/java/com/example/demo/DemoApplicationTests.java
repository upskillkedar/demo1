package com.example.demo;

import com.example.demo.models.CustomerRating;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.BDDMockito.given;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CustomerRatingController customerRatingController;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetCustomerRating() throws Exception {
		CustomerRating customerRating = new CustomerRating("John", 5);
		given(customerRatingController.getCustomerRating()).willReturn(customerRating);

		mockMvc.perform(MockMvcRequestBuilders.get("/getCustomerRating"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.customerName").value("John"))
				.andExpect(MockMvcResultMatchers.jsonPath("$.rating").value(5));
	}
}