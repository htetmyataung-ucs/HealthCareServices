package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

public class ManageHospitalServiceDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long hospitalId;
	private List<ServiceSelectedDTO> serviceList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(Long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public List<ServiceSelectedDTO> getServiceList() {
		return serviceList;
	}
	public void setServiceList(List<ServiceSelectedDTO> serviceList) {
		this.serviceList = serviceList;
	}
	
}
