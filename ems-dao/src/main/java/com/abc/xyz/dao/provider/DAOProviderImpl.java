package com.abc.xyz.dao.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.xyz.dao.spec.DepartmentDAO;
import com.abc.xyz.dao.spec.EmployeeDAO;
import com.abc.xyz.dao.spec.RoleDAO;

@Component
public class DAOProviderImpl implements DAOProvider{

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	@Autowired
	private RoleDAO roleDAO;
	
	@Override
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	@Override
	public DepartmentDAO getDepartmentDAO() {
		return departmentDAO;
	}

	@Override
	public RoleDAO getRoleDAO() {
		return roleDAO;
	}
}
