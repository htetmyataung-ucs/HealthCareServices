package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.sql.Date;

import com.htet.ucs.HealthCareServices.model.Doctor;
import com.htet.ucs.HealthCareServices.model.Hospital;

public class HospitalDoctorDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Date startDate;
	private String startTime;
	private Date endDate;
	private String endTime;
	private Boolean status;
	
	private Hospital hospital;
	
	private Doctor doctor;
	private Long doctorId;
	private String doctorName;
	private String doctorSamaNo;
	private String doctorPhoto;
	private String doctorSpeciality;
	
	public String getDoctorSamaNo() {
		return doctorSamaNo;
	}
	public void setDoctorSamaNo(String doctorSamaNo) {
		this.doctorSamaNo = doctorSamaNo;
	}
	public String getDoctorPhoto() {
		return doctorPhoto;
	}
	public void setDoctorPhoto(String doctorPhoto) {
		this.doctorPhoto = doctorPhoto;
	}
	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}
	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}
	private Long hospitalId;
	private String hospitalName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
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
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
	
	
}
