package com.abc.xyz.dao.spec;

public interface Update<T> {

	void update(T t);
	
	void merge(T t);
	
	void saveOrUpdate(T t);
}
