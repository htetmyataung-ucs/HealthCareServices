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
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class HospitalDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String phone;
	private String address;

	
	  @Column
	  
	  @Temporal(TemporalType.DATE)
	  
	  @JsonFormat(pattern="MM-dd-yyyy")
	 
	private Date date;
	
	  @Column
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  
	  @JsonFormat(pattern="MM-dd-yyyy HH:mm:ss")
	 
	private Time time;
	

	@OneToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
}
