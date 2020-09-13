package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;

import com.htet.ucs.HealthCareServices.model.TownShip;

public class MedicalShopDTO implements Serializable{
	private Long id;
	private String name;
	private String phone;
	private String address;
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
	private TownShip townShip;
	public TownShip getTownShip() {
		return townShip;
	}
	public void setTownShip(TownShip townShip) {
		this.townShip = townShip;
	}
	
}
