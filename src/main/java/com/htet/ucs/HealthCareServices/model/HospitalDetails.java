package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class HospitalDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String phone;
	private String address;
	private Date hospitalDate;
	private Time hospitalTime;
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
	
	public Date getHospitalDate() {
		return hospitalDate;
	}
	public void setHospitalDate(Date hospitalDate) {
		this.hospitalDate = hospitalDate;
	}
	public Time getHospitalTime() {
		return hospitalTime;
	}
	public void setHospitalTime(Time hospitalTime) {
		this.hospitalTime = hospitalTime;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	
}
