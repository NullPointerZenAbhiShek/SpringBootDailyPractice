package com.ex.repository;

import org.springframework.data.repository.CrudRepository;

import com.ex.entity.Product;

public interface IProductRepository extends CrudRepository<Product, Long> {

}
