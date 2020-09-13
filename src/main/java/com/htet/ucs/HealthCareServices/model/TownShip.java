package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TownShip implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
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
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@OneToMany(mappedBy = "townShip")
	private List<Hospital> hospital;
	public List<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}
	@OneToMany(mappedBy = "townShip")
	private List<MedicalShop> medicalShop;
	public List<MedicalShop> getMedicalShop() {
		return medicalShop;
	}
	public void setMedicalShop(List<MedicalShop> medicalShop) {
		this.medicalShop = medicalShop;
	}
		
}
