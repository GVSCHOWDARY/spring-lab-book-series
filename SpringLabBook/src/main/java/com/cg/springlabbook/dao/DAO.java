package com.cg.springlabbook.dao;

import java.util.List;
import com.cg.springlabbook.beans.Employee;


public interface DAO {
 List<Employee> getEmployeeList();

Employee getEmpInfo(int i);
}