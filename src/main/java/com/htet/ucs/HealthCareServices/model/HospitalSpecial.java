package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HospitalSpecial implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType .AUTO)
	private Long id;
	@ManyToOne 
	@JoinColumn(name="hospital_id")
	private Hospital hospital;
	@ManyToOne
	@JoinColumn(name="speciality_id")
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
