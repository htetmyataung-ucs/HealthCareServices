package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Booking implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;


	
	  @Column
	  
	  @Temporal(TemporalType.DATE)
	  
	  @JsonFormat(pattern="MM-dd-yyyy")
	 
	private Date date;
	
	
	  @Column
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
	 
	private Time time;

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
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	
	
}
