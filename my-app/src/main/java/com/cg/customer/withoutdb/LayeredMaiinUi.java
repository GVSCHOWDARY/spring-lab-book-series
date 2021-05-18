package com.cg.customer.withoutdb;

import java.util.Collection;
import java.util.List;

import com.cg.customer.entities.Customer;
import com.cg.customer.exception.InvalidCustomerAgeException;
import com.cg.customer.exception.InvalidCustomerIdException;
import com.cg.customer.exception.invalidCustomerNameException;
import com.cg.customer.service.CustomerServiceImpl2;


public class LayeredMaiinUi {
	private CustomerServiceImpl2 service=new CustomerServiceImpl2();

    public static void main(String args[]){
    	LayeredMaiinUi app=new LayeredMaiinUi();
        app.start();
    }

    public void start(){
       try {
           System.out.println("*** add customers***");
           Customer c1 = service.add("client1", 26);
           Customer c2 = service.add("client2", 28);

           System.out.println("****all customers****");
           List<Customer> all = service.findAll();
           displayCutomers(all);

           System.out.println("*****change customers****");
           int c2Id = c2.getId();
           c2 = service.changeAge(c2Id, 30);

           System.out.println("***all customers after change***");
           all = service.findAll();
           displayCutomers(all);

           System.out.println("*** display employee by id**********");
           Customer fetched = service.findById(c2Id);
           display(fetched);

       }catch(InvalidCustomerAgeException e){
           System.out.println(e.getMessage());
       }
       catch(InvalidCustomerIdException e){
           System.out.println(e.getMessage());
       }
        catch(invalidCustomerNameException e){
           System.out.println(e.getMessage());
        }
    }

    void display(Customer customer){
        System.out.println(customer.getId()+"-"+customer.getName()+"-"+ customer.getAge());
    }
    void displayCutomers(Collection<Customer> customers){
        for(Customer emp:customers){
            display(emp);
        }
    }
}
