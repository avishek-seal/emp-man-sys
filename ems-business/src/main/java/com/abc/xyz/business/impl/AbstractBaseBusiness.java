package com.abc.xyz.business.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.abc.xyz.business.spec.BusinessSpecification;
import com.abc.xyz.dao.provider.DAOProvider;

public abstract class AbstractBaseBusiness<M> implements BusinessSpecification<M>{

	@Autowired
	private DAOProvider daoProvider;

	public DAOProvider getDaoProvider() {
		return daoProvider;
	}
}
