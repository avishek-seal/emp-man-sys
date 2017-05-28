package com.abc.xyz.business.spec;

import java.io.Serializable;
import java.util.Collection;

public interface BusinessSpecification<M> {

	void create(M m);
	
	void update(M m);
	
	void delete(M m);
	
	M get(Serializable id);
	
	Collection<M> getAll();
}
