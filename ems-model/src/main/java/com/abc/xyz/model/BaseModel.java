package com.abc.xyz.model;

import java.io.Serializable;

public abstract class BaseModel implements Serializable{

	private static final long serialVersionUID = -7786413663555171663L;

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
