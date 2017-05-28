package com.abc.xyz.dao.impl;

import org.springframework.stereotype.Repository;

import com.abc.xyz.dao.spec.DepartmentDAO;
import com.abc.xyz.entity.Department;

@Repository
public class DepartmentDAOImpl extends BaseDAO<Department> implements DepartmentDAO{

	public DepartmentDAOImpl() {
		super(Department.class);
	}
}
