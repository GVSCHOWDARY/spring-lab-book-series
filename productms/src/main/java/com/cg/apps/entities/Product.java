package com.cg.apps.entities;

import java.util.Objects;

public class Product {
	private int product_id;

	private String name;

	private double price;

	public Product() {

	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public int getProduct_Id() {
		return product_id;
	}

	public void setProduct_Id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Product product = (Product) o;
		return Objects.equals(product_id, product.product_id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(product_id);
	}

}
