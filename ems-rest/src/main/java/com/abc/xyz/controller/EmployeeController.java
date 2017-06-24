package com.abc.xyz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.xyz.model.EmployeeModel;
import com.abc.xyz.response.ResponseEntity;

@RestController
public class EmployeeController extends AbstractGenericController{

	@RequestMapping(value="/employee", method=RequestMethod.POST)
	public ResponseEntity<?> create(EmployeeModel employeeModel) {
		final ResponseEntity<?> responseEntity = new ResponseEntity<>();
		
		try {
			//create employee business call
			responseEntity.setSuccess(true);
			responseEntity.setCode(200);
			responseEntity.setMessage("Successfully created employee");
		} catch (Exception e) {
			responseEntity.setSuccess(false);
			responseEntity.setCode(500);
			responseEntity.setMessage(e.getMessage());
		}
		
		return responseEntity;
	}
}
