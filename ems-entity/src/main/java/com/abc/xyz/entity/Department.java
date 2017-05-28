package com.abc.xyz.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="department")
public class Department extends BaseEntity{

	@Transient
	private static final long serialVersionUID = -1000031199019025225L;

	@Column(name="name")
	private String name;

	@OneToMany(mappedBy="department", fetch=FetchType.LAZY)
	private List<Employee> employees;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
