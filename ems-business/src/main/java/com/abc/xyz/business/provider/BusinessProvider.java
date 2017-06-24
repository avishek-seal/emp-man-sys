package com.abc.xyz.business.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abc.xyz.business.spec.EmployeeBusiness;

@Component
public class BusinessProvider {

	@Autowired
	private EmployeeBusiness employeeBusiness;
	
	public EmployeeBusiness getEmployeeBusiness() {
		return employeeBusiness;
	}
}
