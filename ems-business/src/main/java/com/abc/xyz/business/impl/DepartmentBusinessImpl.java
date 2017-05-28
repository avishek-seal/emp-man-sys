package com.abc.xyz.business.impl;

import java.io.Serializable;
import java.util.Collection;

import com.abc.xyz.business.spec.DepartmentBusiness;
import com.abc.xyz.entity.Department;
import com.abc.xyz.model.DepartmentModel;

public class DepartmentBusinessImpl extends AbstractBaseBusiness<DepartmentModel> implements DepartmentBusiness{

	@Override
	public void create(DepartmentModel m) {
		Department department = new Department();
		
		getDaoProvider().getDepartmentDAO().create(department);
	}

	@Override
	public void update(DepartmentModel m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DepartmentModel m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DepartmentModel get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<DepartmentModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
