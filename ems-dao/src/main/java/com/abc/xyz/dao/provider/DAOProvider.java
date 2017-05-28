package com.abc.xyz.dao.provider;

import com.abc.xyz.dao.spec.DepartmentDAO;
import com.abc.xyz.dao.spec.EmployeeDAO;
import com.abc.xyz.dao.spec.RoleDAO;

public interface DAOProvider {

	EmployeeDAO getEmployeeDAO();
	
	DepartmentDAO getDepartmentDAO();
	
	RoleDAO getRoleDAO();
}
