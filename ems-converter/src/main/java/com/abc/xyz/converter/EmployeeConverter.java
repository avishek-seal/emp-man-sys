package com.abc.xyz.converter;

import org.springframework.stereotype.Component;

import com.abc.xyz.entity.Employee;
import com.abc.xyz.model.EmployeeModel;

@Component
public class EmployeeConverter implements Converter<Employee, EmployeeModel>{

	@Override
	public Employee convertToEntyity(EmployeeModel m) {
		if(m != null) {
			final Employee employee = new Employee();
			
			employee.setId(m.getId());
			employee.setDateOfBirth(m.getDateOfBirth());
			employee.setName(m.getName());
			employee.setSalary(m.getSalary());
			
			return employee;
		}
		return null;
	}
	
	@Override
	public EmployeeModel convertToModel(Employee e) {
		if(e != null) {
			final EmployeeModel employeeModel = new EmployeeModel();
			
			employeeModel.setDateOfBirt(e.getDateOfBirth());
			employeeModel.setId(e.getId());
			employeeModel.setName(e.getName());
			employeeModel.setSalary(e.getSalary());
			
			return employeeModel;
		}
		return null;
	}
}
