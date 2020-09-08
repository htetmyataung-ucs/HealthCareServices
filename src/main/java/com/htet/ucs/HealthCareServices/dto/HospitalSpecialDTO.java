package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;

import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.model.Speciality;

public class HospitalSpecialDTO implements Serializable{

	private Long id;
	private Hospital hospital;
	private Speciality speciality;
	private boolean status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
