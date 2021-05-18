package com.cg.apps;

import java.util.Collection;
import java.util.List;

import com.cg.apps.entities.Product;
import com.cg.apps.exception.InvalidPriceException;
import com.cg.apps.exception.InvalidProductIdException;
import com.cg.apps.exception.InvalidProductNameException;
import com.cg.apps.services.IProductService;
import com.cg.apps.services.IProductServiceImplementation;

public class LayeredMain {
	private IProductService service = new IProductServiceImplementation();
	public static void main(String args[]) {
		LayeredMain app = new LayeredMain();
		app.start();
	}

	public void start() {
		try {
			System.out.println("**********adding products**************");

			Product p1 = service.add("product1", 900);
			Product p2 = service.add("product2", 800);
			Product p3 = service.add("product3", 600);
			Product p4 = service.add("product3", 500);

			System.out.println("**********display all Products*******");
			List<Product> all=service.findAll();
			displayProducts(all);
			
			System.out.println("********updated Price **************");
			int p2Id = p2.getProduct_Id();
			p2 = service.updatePrice(p2Id, 555);
			int p3Id = p3.getProduct_Id();
			p3 = service.updatePrice(p3Id, 200);
			System.out.println("***********all products after update***********");
			all = service.findAll();
			displayProducts(all);

			System.out.println("******display employee by id***********");
			Product fetched = service.findById(p3Id);
			display(fetched);
			System.out.println("find product by id");

		} 
		catch (InvalidProductIdException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
		catch (InvalidProductNameException e) {
			System.out.println(e.getMessage());
		}
	}

	void display(Product product) {
		System.out.println(product.getProduct_Id() + "-" + product.getName() + "-" + product.getPrice());
	}

	void displayProducts(Collection<Product> products) {
		for (Product p : products) {
			display(p);
		}
	}
}
