package com.abc.xyz.converter;

public interface Converter<E, M> {

	E convertToEntyity(M m);
	
	M convertToModel(E e);
}
