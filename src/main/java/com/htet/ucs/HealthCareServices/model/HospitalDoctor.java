package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;





@Entity
public class HospitalDoctor implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date doctorDate;
	
	//private Time doctorTime;
	private Boolean status;
	@ManyToOne
	@JoinColumn(name = "hospital_id")
	private Hospital hospital;
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getDoctorDate() {
		return doctorDate;
	}
	public void setDoctorDate(Date doctorDate) {
		this.doctorDate = doctorDate;
	}
	
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	/*
	 * public Time getDoctorTime() { return doctorTime; } public void
	 * setDoctorTime(Time doctorTime) { this.doctorTime = doctorTime; }
	 */
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
}
