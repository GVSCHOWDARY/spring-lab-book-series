package com.cg.customer.service;

import java.util.List;

import com.cg.customer.entities.Customer;


public interface ICustomerService {

	Customer add(String name, double salary);

	Customer changeSalary(int empId, double newSalary);

	Customer findById(int empId);

    List<Customer> findAll();

}
