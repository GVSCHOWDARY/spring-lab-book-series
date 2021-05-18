package org.cpag.springlabbook.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

public class SBU {
	
	@Value("${sbuCode}")
	private String sbuCode;
	@Value("${sbuName}")
	private String subName;
	@Value("${sbuHead}")
	private String subHead;
	
	private List<Employee>emplist;
	
	public List<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}
	public SBU(String sbuCode, String subName, String subHead) {
		super();
		this.sbuCode = sbuCode;
		this.subName = subName;
		this.subHead = subHead;
	}
	public SBU() {
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	
	
}
