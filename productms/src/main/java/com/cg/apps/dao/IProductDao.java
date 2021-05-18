package com.cg.apps.dao;

import java.util.List;

import com.cg.apps.entities.Product;

public interface IProductDao {
	Product add(Product product);

	Product updatePrice(Product product);

	Product findById(int id);

	List<Product> findAll();
}