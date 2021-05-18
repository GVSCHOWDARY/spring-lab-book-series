package com.cg.springlabbook.beans;

import java.util.*;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList=new ArrayList<>();
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public Employee getEmpInfo(int i) {
		Employee emp=new Employee();
		for(Employee e:empList) {
			if( i==e.getId())
				emp=e;
		}
		return emp;
	}
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	@Override
	public String toString() {
		return "SBU Details:\n"+"----------------------------\n" + "sbuCode=PES-BU"  + ", sbuHead=" + sbuHead   + ", sbuName=" + sbuName ;
	}
	
	
}
