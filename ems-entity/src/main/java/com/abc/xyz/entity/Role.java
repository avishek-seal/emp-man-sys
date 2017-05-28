package com.abc.xyz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="role")
public class Role extends BaseEntity{

	@Transient
	private static final long serialVersionUID = -4107812574130778553L;

	@Column(name = "name")
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="responsibility")
	private Responsibility responsibility;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="employee_role", joinColumns={@JoinColumn(name="role_id")}, inverseJoinColumns={@JoinColumn(name="employee_id")})
	private List<Employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Responsibility getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(Responsibility responsibility) {
		this.responsibility = responsibility;
	}
}
