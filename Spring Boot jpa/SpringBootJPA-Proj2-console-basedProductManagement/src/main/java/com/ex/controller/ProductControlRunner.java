package com.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.ex.entity.Product;
import com.ex.service.IProductService;
@Controller
public class ProductControlRunner implements CommandLineRunner {
	@Autowired
	private IProductService prodServ;
	@Override
	public void run(String... args) throws Exception {
		try {
			Product product = Product.builder()
					.productName("Sofa")
					.description("Fine lether sofa")
					.price(12000.59)
					.build();
			prodServ.insertProduct(product);
		} catch (Exception e) {
			e.printStackTrace();}

	}//End main

}//class end
