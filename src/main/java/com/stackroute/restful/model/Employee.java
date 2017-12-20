package com.stackroute.restful.model;

public class Employee {


	int id;
	String name;	
	int salary;
	String designation;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}	
	
	
	


	
	
}
