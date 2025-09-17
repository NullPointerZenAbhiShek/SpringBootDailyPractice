package com.as.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.as.controller.HousingManagementController;
import com.as.entity.Housing;

@Component
public class HousingTestRunner implements CommandLineRunner  {
	@Autowired
	private HousingManagementController HMCr;
@Override
public void run(String... args) throws Exception {
	try {
		/*
		String msg = HMCr.addHOusesDetails(List.of(
				Housing.builder()
		        .ownerName("John Doe")
		        .address("123 Main St")
		        .city("New York")
		        .state("NY")
		        .postalCode("10001")
		        .price(250000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),
		        
		        Housing.builder()
		        .ownerName("Tom")
		        .address("11 Lake View")
		        .city("Boston")
		        .state("MA")
		        .postalCode("02118")
		        .price(500000.0)
		        .bedrooms(5)
		        .bathrooms(4)
		        .build(),

		    Housing.builder()
		        .ownerName("Emma")
		        .address("22 Hill St")
		        .city("Seattle")
		        .state("WA")
		        .postalCode("98101")
		        .price(450000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),
		        
		        Housing.builder()
		        .ownerName("Sophia")
		        .address("101 Maple St")
		        .city("Denver")
		        .state("CO")
		        .postalCode("80201")
		        .price(350000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),

		    Housing.builder()
		        .ownerName("Liam")
		        .address("202 Oakwood Dr")
		        .city("Austin")
		        .state("TX")
		        .postalCode("73301")
		        .price(420000.0)
		        .bedrooms(4)
		        .bathrooms(3)
		        .build(),

		    Housing.builder()
		        .ownerName("Isabella")
		        .address("303 Cedar Ln")
		        .city("San Diego")
		        .state("CA")
		        .postalCode("92101")
		        .price(600000.0)
		        .bedrooms(5)
		        .bathrooms(4)
		        .build(),

		    Housing.builder()
		        .ownerName("Ethan")
		        .address("404 Birch Rd")
		        .city("Phoenix")
		        .state("AZ")
		        .postalCode("85001")
		        .price(275000.0)
		        .bedrooms(2)
		        .bathrooms(1)
		        .build(),

		    Housing.builder()
		        .ownerName("Mia")
		        .address("505 Pine St")
		        .city("Orlando")
		        .state("FL")
		        .postalCode("32801")
		        .price(480000.0)
		        .bedrooms(4)
		        .bathrooms(3)
		        .build(),

		    Housing.builder()
		        .ownerName("Noah")
		        .address("606 Walnut Ave")
		        .city("Columbus")
		        .state("OH")
		        .postalCode("43004")
		        .price(320000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),

		    Housing.builder()
		        .ownerName("Ava")
		        .address("707 Cherry Blvd")
		        .city("Portland")
		        .state("OR")
		        .postalCode("97201")
		        .price(510000.0)
		        .bedrooms(4)
		        .bathrooms(3)
		        .build(),

		    Housing.builder()
		        .ownerName("James")
		        .address("808 Spruce Ct")
		        .city("Salt Lake City")
		        .state("UT")
		        .postalCode("84101")
		        .price(295000.0)
		        .bedrooms(2)
		        .bathrooms(2)
		        .build(),

		    Housing.builder()
		        .ownerName("Olivia")
		        .address("909 Elmwood Way")
		        .city("Raleigh")
		        .state("NC")
		        .postalCode("27601")
		        .price(450000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),

		    Housing.builder()
		        .ownerName("Benjamin")
		        .address("111 Willow Cir")
		        .city("Houston")
		        .state("TX")
		        .postalCode("77001")
		        .price(370000.0)
		        .bedrooms(3)
		        .bathrooms(2)
		        .build(),

		    Housing.builder()
		        .ownerName("Charlotte")
		        .address("222 Magnolia Dr")
		        .city("Atlanta")
		        .state("GA")
		        .postalCode("30301")
		        .price(525000.0)
		        .bedrooms(5)
		        .bathrooms(4)
		        .build(),

		    Housing.builder()
		        .ownerName("Henry")
		        .address("333 Aspen Ln")
		        .city("Chicago")
		        .state("IL")
		        .postalCode("60601")
		        .price(400000.0)
		        .bedrooms(4)
		        .bathrooms(3)
		        .build()

				));
		System.err.println(msg);
//		Iterable<Housing> houses = HMCr.showHousesByShorted(false, "ownerName","city");
//		houses.forEach(System.out::println);
		Page<Housing> pagination = HMCr.showHousesInfoByPageNo(0, 4, false, "ownerName","city");
		pagination.forEach(System.out::println);
		*/
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
