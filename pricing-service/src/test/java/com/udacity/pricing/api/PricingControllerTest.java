package com.udacity.pricing.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(PricingController.class)
public class PricingControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void should_get_vehicle_price() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/services/price")
			.param("vehicleId", "2");

		mockMvc.perform(request)
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
