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
public class HospitalDoctor implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

<<<<<<< HEAD
	
	  @Column
	  
	  @Temporal(TemporalType.DATE)
	  
	  @JsonFormat(pattern="MM-dd-yyyy")
	 
=======
	@Column  
	@Temporal(TemporalType.DATE)
    @JsonFormat(pattern="MM-dd-yyyy")
>>>>>>> master
	private Date date;
	
<<<<<<< HEAD
	  @Column
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
	 
	private Time time;
	

=======
>>>>>>> master
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
	
<<<<<<< HEAD

	

	public Date getDate() {
=======
public Date getDate() {
>>>>>>> master
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
