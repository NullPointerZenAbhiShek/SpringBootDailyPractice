package com.ex.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.entity.Product;
import com.ex.repository.IProductRepository;
@Service
public class IProductServiceImpl implements IProductService {
	@Autowired
	private IProductRepository prodRepo;
	@Override
	public void insertProduct(Product product) {
		System.out.println("IProductServiceImpl.insertProduct()");
		Product prod = prodRepo.save(product);
		System.out.println("The "+prod.getProductName()+" product is save "+prod.getProductId());

	}

}
