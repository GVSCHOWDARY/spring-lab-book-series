package com.cg.springlabbook.dao;

import java.util.List;

import com.cg.springlabbook.beans.*;

public class iDAO implements DAO{
	 SBU sbu;
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	@Override
	public List<Employee> getEmployeeList() {
		return sbu.getEmpList();
	}
	@Override
	public Employee getEmpInfo(int i) {
		Employee emp=new Employee();
		for(Employee e:sbu.getEmpList()) {
			if( i==e.getId())
				emp=e;
		}
		return emp;
	}


	

}