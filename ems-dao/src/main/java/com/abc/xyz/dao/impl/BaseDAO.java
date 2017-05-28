package com.abc.xyz.dao.impl;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.abc.xyz.dao.spec.DAOSpecification;

public abstract class BaseDAO<T> implements DAOSpecification<T>{

	private final Class<T> entityClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public BaseDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public Serializable create(T t) {
		return getCurrentSession().save(t);
	}
	
	@Override
	public void save(T t) {
		getCurrentSession().persist(t);
	}
	
	@Override
	public void update(T t) {
		getCurrentSession().update(t);
	}
	
	@Override
	public void merge(T t) {
		getCurrentSession().merge(t);		
	}
	
	@Override
	public void delete(T t) {
		getCurrentSession().delete(t);
	}
	
	@Override
	public void saveOrUpdate(T t) {
		getCurrentSession().saveOrUpdate(t);
	}
	
	@Override
	public T get(Serializable id) {
		return getCurrentSession().get(entityClass, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Collection<T> getAll() {
		return getCurrentSession().createCriteria(entityClass).list();
	}
}
