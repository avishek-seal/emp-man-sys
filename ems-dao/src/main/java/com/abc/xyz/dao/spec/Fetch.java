package com.abc.xyz.dao.spec;

import java.io.Serializable;
import java.util.Collection;

public interface Fetch<T> {

	T get(Serializable id);
	
	Collection<T> getAll();
}
