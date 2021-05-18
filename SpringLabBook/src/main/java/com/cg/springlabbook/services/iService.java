package com.cg.springlabbook.services;

import java.util.List;

import com.cg.springlabbook.beans.Employee;
import com.cg.springlabbook.dao.iDAO;

public class iService implements Service {
	iDAO dao;
	
	public iDAO getDao() {
		return dao;
	}

	public void setDao(iDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Employee> getEmployeeList() {
		return dao.getEmployeeList();
	}

	@Override
	public Employee getEmpInfo(int i) {
		return dao.getEmpInfo(i);
	}

}