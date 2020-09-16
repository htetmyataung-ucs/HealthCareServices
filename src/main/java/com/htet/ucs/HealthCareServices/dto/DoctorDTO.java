package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

import com.htet.ucs.HealthCareServices.model.HospitalDoctor;
import com.htet.ucs.HealthCareServices.model.Speciality;

public class DoctorDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String sama_no;
	private Speciality speciality;
	private List<HospitalDoctor> hospitalDoctor;
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
	public String getSama_no() {
		return sama_no;
	}
	public void setSama_no(String sama_no) {
		this.sama_no = sama_no;
	}
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	public List<HospitalDoctor> getHospitalDoctor() {
		return hospitalDoctor;
	}
	public void setHospitalDoctor(List<HospitalDoctor> hospitalDoctor) {
		this.hospitalDoctor = hospitalDoctor;
	}
	
}
