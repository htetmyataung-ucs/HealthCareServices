package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.htet.ucs.HealthCareServices.model.HospitalService;

public class ServiceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String description;
	private String photo;
	private MultipartFile file;
	private List<HospitalService> hospitalService;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public List<HospitalService> getHospitalService() {
		return hospitalService;
	}
	public void setHospitalService(List<HospitalService> hospitalService) {
		this.hospitalService = hospitalService;
	}
	
}
