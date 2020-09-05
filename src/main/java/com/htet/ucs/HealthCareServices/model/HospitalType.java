package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class HospitalType implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(mappedBy = "hospitalType")
	private List<Hospital> hospital;
	public List<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}
	
	
}
