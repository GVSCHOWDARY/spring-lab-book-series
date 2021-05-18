package com.cg.springlabbook.services;

import java.util.List;

import com.cg.springlabbook.beans.Employee;

public interface Service {
	List<Employee> getEmployeeList();

	Employee getEmpInfo(int i);
}