package org.capg.springlabbook;

import java.util.ArrayList;
import java.util.List;

import org.cpag.springlabbook.beans.Employee;
import org.cpag.springlabbook.beans.SBU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:app.properties")
@ComponentScan("org.capg.springlabbook")
@Configuration
public class JavaConfig {
	
	@Bean
	public SBU getSBU() {
		SBU sbu=new SBU();
		List<Employee>list=employeesList();
		sbu.setEmplist(list);
		return sbu;
	}
	
	
	public List<Employee> employeesList() {

		List<Employee> emplist=new ArrayList<Employee>();
		Employee emp1=new Employee(1234,"venky",50000,30);
		Employee emp2=new Employee(1235,"sai",20000,22);
		
		emplist.add(emp1);
		emplist.add(emp2);
		
		return emplist;
	}

}
