package com.abc.xyz.dao.impl;

import org.springframework.stereotype.Repository;

import com.abc.xyz.dao.spec.EmployeeDAO;
import com.abc.xyz.entity.Employee;

@Repository
public class EmployeeDAOImpl extends BaseDAO<Employee> implements EmployeeDAO{

	public EmployeeDAOImpl() {
		super(Employee.class);
	}

}
