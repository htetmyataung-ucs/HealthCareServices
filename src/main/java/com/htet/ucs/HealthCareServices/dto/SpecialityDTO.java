package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

import com.htet.ucs.HealthCareServices.model.Doctor;
import com.htet.ucs.HealthCareServices.model.HospitalSpecial;

public class SpecialityDTO implements Serializable{

	   private Long id;
	   private String name;
	   private List<HospitalSpecial> hospitalSpecial;
	   private List<Doctor> doctor;
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
	public List<HospitalSpecial> getHospitalSpecial() {
		return hospitalSpecial;
	}
	public void setHospitalSpecial(List<HospitalSpecial> hospitalSpecial) {
		this.hospitalSpecial = hospitalSpecial;
	}
	public List<Doctor> getDoctor() {
		return doctor;
	}
	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}
	   
	   
	   
}
