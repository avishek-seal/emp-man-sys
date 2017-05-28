package com.abc.xyz.dao.spec;

import java.io.Serializable;

public interface Save<T> {

	/**
	 * this method is used to create row in database and after that
	 * it return the id of the row
	 * @param t
	 * @return
	 */
	Serializable create(T t);
	
	/**
	 * this method is used to create row in database
	 * 
	 * @param t
	 */
	void save(T t);
}
