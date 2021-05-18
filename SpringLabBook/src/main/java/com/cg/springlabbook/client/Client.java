package com.cg.springlabbook.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springlabbook.beans.*;
import com.cg.springlabbook.services.iService;

public class Client {

	public static void main(String[] args) {
		AbstractApplicationContext xml=new ClassPathXmlApplicationContext("springcore.xml");
		iService s=(iService)xml.getBean("ser");
		
		System.out.println(s.getEmployeeList());
		System.out.println(s.getEmpInfo(123));
	}

}