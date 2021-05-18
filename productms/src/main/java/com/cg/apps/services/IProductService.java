package com.cg.apps.services;

import java.util.List;

import com.cg.apps.entities.Product;

public interface IProductService {
	Product add(String name, double price);

	Product updatePrice(int productId, double updatedprice);

	Product findById(int productId);

	List<Product> findAll();

}
