package com.cg.springlabbook.beans;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Emplyoee details \n------------------------\n"+"Employee ID: " + id + "\nEmployee Name: " + name + "\n Employee Salary: " + salary + "\n Employee Age: " + age ;
	}
	
	
	
	
}