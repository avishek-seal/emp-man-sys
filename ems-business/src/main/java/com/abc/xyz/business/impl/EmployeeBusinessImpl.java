package com.abc.xyz.business.impl;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abc.xyz.business.spec.EmployeeBusiness;
import com.abc.xyz.entity.Employee;
import com.abc.xyz.model.EmployeeModel;

@Transactional
@Service
public class EmployeeBusinessImpl extends AbstractBaseBusiness<EmployeeModel> implements EmployeeBusiness{

	@Override
	public void create(EmployeeModel m) {
		if(m != null) {
			final Employee employee = new Employee();
			
			if(m.getDateOfBirth() != null) {
				employee.setDateOfBirth(m.getDateOfBirth());
			} else {
				throw new RuntimeException("Invalid date of birth");
			}
			
			if(m.getName() != null && !m.getName().equals("")) {
				employee.setName(m.getName());
			} else {
				throw new RuntimeException("Invalid Name");
			}
			
			employee.setSalary(m.getSalary());
			
			getDaoProvider().getEmployeeDAO().create(employee);
		}
	}

	@Override
	public void update(EmployeeModel m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EmployeeModel m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeModel get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<EmployeeModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
