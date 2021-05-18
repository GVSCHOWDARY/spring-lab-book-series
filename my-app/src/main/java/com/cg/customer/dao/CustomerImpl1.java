package com.cg.customer.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.customer.entities.Customer;


public class CustomerImpl1 implements ICustomerDao {
	private Map<Integer, Customer>store = new HashMap<>();

    private int generatedId;

    int generateId(){
        return ++generatedId;
    }
	@Override
	public Customer add(Customer customer) {
		 int newId=generateId();
		 customer.setId(newId);
	        store.put(newId,customer);
	        return customer;
	}

	@Override
	public Customer update(Customer customer) {
		  int id=customer.getId();
	        store.put(id,customer);
	        return customer;
	}

	@Override
	public Customer findById(int id) {
		Customer employee =store.get(id);
        return employee;
	}

	@Override
	public List<Customer> findAll() {
		Collection<Customer>customer =store.values();
        List<Customer>list=new ArrayList<>(customer);
        return list;
	}

}
