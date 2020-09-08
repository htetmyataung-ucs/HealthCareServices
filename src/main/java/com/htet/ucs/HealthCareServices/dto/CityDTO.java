package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

import com.htet.ucs.HealthCareServices.model.TownShip;

public class CityDTO implements Serializable{
	private Long id;
	private String name;
	private List<TownShip> township;
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
	public List<TownShip> getTownship() {
		return township;
	}
	public void setTownship(List<TownShip> township) {
		this.township = township;
	}
	
	
	
}
