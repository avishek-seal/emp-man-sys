package com.abc.xyz.dao.impl;

import org.springframework.stereotype.Repository;

import com.abc.xyz.dao.spec.RoleDAO;
import com.abc.xyz.entity.Role;

@Repository
public class RoleDAOImpl extends BaseDAO<Role> implements RoleDAO{

	public RoleDAOImpl() {
		super(Role.class);
	}

	
}
