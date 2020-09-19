package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;

import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.model.Speciality;

public class HospitalSpecialDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private Long hospitalId;
	private Long specialityId;
	private String hospitalName;
	private String specialityName;
	public Long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public Long getSpecialityId() {
		return specialityId;
	}
	public void setSpecialityId(Long specialityId) {
		this.specialityId = specialityId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getSpecialityName() {
		return specialityName;
	}
	public void setSpecialityName(String specialityName) {
		this.specialityName = specialityName;
	}
	
	
}
