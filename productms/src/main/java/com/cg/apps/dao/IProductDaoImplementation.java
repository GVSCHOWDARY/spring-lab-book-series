package com.cg.apps.dao;

import java.util.*;

import com.cg.apps.entities.Product;

public class IProductDaoImplementation implements IProductDao{
	private Map<Integer, Product> store = new HashMap<>();

	private int generatedProduct_Id;

	int generateProduct_Id() {
		return ++generatedProduct_Id;
	}

	    @Override
	    public Product add(Product product) {
	        int newProduct_Id=generateProduct_Id();
	        product.setProduct_Id(generatedProduct_Id);
	        store.put(newProduct_Id,product);
	        return product;
	    }

	    @Override
	    public Product updatePrice(Product product) {
	        int id=product.getProduct_Id();
	        store.put(id,product);// from store data get add
	        return product;
	    }

	    @Override
	    public Product findById(int Product_Id) {
	    	Product product =store.get(Product_Id);
	        return product;
	    }

	    @Override
	    public List<Product> findAll() {
	        Collection<Product>products =store.values();
	        List<Product>list=new ArrayList<>(products);
	        return list;
	    }

}
