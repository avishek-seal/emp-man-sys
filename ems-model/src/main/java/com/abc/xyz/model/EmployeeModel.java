package com.abc.xyz.model;

import java.util.Date;

public class EmployeeModel extends BaseModel{
	
	private static final long serialVersionUID = 5563941003401958910L;

	private String name;
	
	private Date dateOfBirth;
	
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirt(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
