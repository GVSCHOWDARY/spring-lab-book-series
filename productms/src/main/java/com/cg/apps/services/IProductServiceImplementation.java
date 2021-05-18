package com.cg.apps.services;

import java.util.*;

import com.cg.apps.dao.IProductDao;
import com.cg.apps.dao.IProductDaoImplementation;
import com.cg.apps.entities.Product;
import com.cg.apps.exception.InvalidPriceException;
import com.cg.apps.exception.InvalidProductIdException;
import com.cg.apps.exception.InvalidProductNameException;

public class IProductServiceImplementation implements IProductService {
	private IProductDao productdao = new IProductDaoImplementation();

	@Override
	public Product add(String name, double price) {
		validateName(name);
		validatePrice(price);
		Product product = new Product(name, price);
		Product saved = productdao.add(product);
		return saved;
	}

	@Override
	public Product findById(int productId) {
		validateId(productId);
		Product product = productdao.findById(productId);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> list = productdao.findAll();
		return list;
	}

	@Override
	public Product updatePrice(int product_Id, double updatedprice) {
		validatePrice(updatedprice);
		Product product = productdao.findById(product_Id);
		product.setPrice(updatedprice);
		Product saved = productdao.updatePrice(product);
		return saved;
	}

	void validateId(int id) {
		if (id < 0) {
			throw new InvalidProductIdException("id can't be negative");
		}
	}

	void validateName(String name) throws InvalidProductNameException {
		if (name == null || name.isEmpty()) {
			throw new InvalidProductNameException("name can't be null ");
		}

	}

	void validatePrice(double price) {
		if (price < 0) {
			throw new InvalidPriceException("price can't be negative");
		}

	}

}
