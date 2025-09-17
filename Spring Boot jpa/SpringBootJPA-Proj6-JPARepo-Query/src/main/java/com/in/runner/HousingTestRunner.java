package com.in.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.in.controller.HousingManagementController;
import com.in.entity.Housing;

@Component
public class HousingTestRunner implements CommandLineRunner  {
	@Autowired
	private HousingManagementController controller;
@Override
public void run(String... args) throws Exception {
	try {
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}
