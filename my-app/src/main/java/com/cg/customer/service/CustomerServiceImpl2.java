package com.cg.customer.service;

import java.util.List; 

import com.cg.customer.dao.CustomerImpl1;
import com.cg.customer.entities.Customer;
import com.cg.customer.exception.InvalidCustomerAgeException;
import com.cg.customer.exception.InvalidCustomerIdException;
import com.cg.customer.exception.invalidCustomerNameException;



public class CustomerServiceImpl2 {
    private CustomerImpl1 dao=new CustomerImpl1();
    //@Override
    public Customer add(String name, Integer age) {
        validateName(name);
        validateAge(age);
        Customer customer=new Customer(name, age);
        Customer saved =dao.add(customer);
        return saved;
    }


    //@Override
    public Customer findById(int empId) {
        validateId(empId);
        Customer customer= dao.findById(empId);
       return customer;
    }

   // @Override
    public List<Customer> findAll() {
       List<Customer>list= dao.findAll();
       return list;
    }

   // @Override
    public Customer changeAge(int cusId,Integer newAge ) {
        validateId(cusId);
        validateAge(newAge);

        Customer customer=dao.findById(cusId);
        customer.setAge(newAge);
        Customer saved=dao.update(customer);
        return saved ;
    }
    void validateId(int id){
        if(id<0){
            throw new InvalidCustomerIdException("id can't be negative");
        }
    }

    void validateName(String name){
        if(name==null || name.isEmpty()){
            throw new invalidCustomerNameException("name can't be null or empty");
        }

    }
    void validateAge(double age){
        if(age<18){
            throw new InvalidCustomerAgeException("age can't be less than 18");
        }

    }

}
