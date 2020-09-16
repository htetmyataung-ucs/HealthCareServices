package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Speciality implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
@OneToMany(mappedBy="speciality")
private List<HospitalSpecial> hospitalSpecial;
public List<HospitalSpecial> getHospitalSpecial() {
	return hospitalSpecial;
}
public void setHospitalSpecial(List<HospitalSpecial> hospitalSpecial) {
	this.hospitalSpecial = hospitalSpecial;
}
@OneToMany(mappedBy = "speciality")
private List<Doctor> doctor;
public List<Doctor> getDoctor() {
	return doctor;
}
public void setDoctor(List<Doctor> doctor) {
	this.doctor = doctor;
}

   
}

