package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.sql.Date;

import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.model.Patient;

public class BookingDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date date;
	private String time;
	
	private Hospital hospital;
	private Long hospitalId;
	private String hospitalName;
	
	private Patient patient;
	private Long patientId;
	private String patientName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	
}
