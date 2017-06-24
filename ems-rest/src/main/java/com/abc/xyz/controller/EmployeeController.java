package com.abc.xyz.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.xyz.model.EmployeeModel;
import com.abc.xyz.response.ResponseEntity;

@RestController
public class EmployeeController extends AbstractGenericController {

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ResponseEntity<?> create(EmployeeModel employeeModel) {
		final ResponseEntity<?> responseEntity = new ResponseEntity<>();

		try {
			getBusinessProvider().getEmployeeBusiness().create(employeeModel);
			
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

	@RequestMapping(value = "/employee/{id}/{resource}", method = RequestMethod.GET)
	public ResponseEntity<?> fetch(@PathVariable("id") String id, @PathVariable("resource") String resource) {
		final ResponseEntity<ArrayList<String>> responseEntity = new ResponseEntity<>();

		System.out.println(id);
		System.out.println(resource);
		
		try {
			switch (resource) {
				case "phone":
					responseEntity.setData(new ArrayList<String>());
					break;
				
				case "roles":
					
					break;
				
				default:
					
					break;
			}
		} catch (Exception e) {

		}
		
		return responseEntity;
	}
	
	@ExceptionHandler(Throwable.class)
	  public String handleAnyException(Throwable ex, HttpServletRequest request) {
	    return ClassUtils.getShortName(ex.getClass());
	  }
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ResponseEntity<?> error(){
		ResponseEntity<?> entity = new ResponseEntity<>();
		
		
		entity.setCode(404);
		entity.setMessage("Invalid URL");
		entity.setSuccess(false);
		
		return entity;
	}
}
