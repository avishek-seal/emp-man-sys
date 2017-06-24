package com.abc.xyz.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.xyz.business.provider.BusinessProvider;

public abstract class AbstractGenericController {
	
	@Autowired
	private BusinessProvider businessProvider;

	public BusinessProvider getBusinessProvider() {
		return businessProvider;
	}
}
