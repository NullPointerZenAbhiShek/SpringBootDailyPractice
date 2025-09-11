package com.abhi.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.abhi.entity.Housing;
import com.abhi.service.IHousingService;
@Controller
public class HousingTestRunner implements CommandLineRunner {
	@Autowired
	private IHousingService hrs;
	@Override
	public void run(String... args) throws Exception {
		try {
			Housing house = Housing.builder()
			        .ownerName("Chiku")
			        .address("123 Janpriya Road")
			        .city("Mumbai")
			        .state("Gujrat")
			        .postalCode("352011")
			        .price(7500000.0)
			        .bedrooms(1)
			        .bathrooms(1)
			        .build();

			String msg = hrs.addHouseDetails(house);
			
			System.err.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
