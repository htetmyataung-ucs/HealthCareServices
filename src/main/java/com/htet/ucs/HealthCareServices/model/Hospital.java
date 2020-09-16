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
public class Hospital implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	
	@ManyToOne
	@JoinColumn(name="hospitalCategory_id")
	private HospitalCategory hospitalCategory;
	
	
	@ManyToOne
	@JoinColumn(name="hospitalType_id")
	private HospitalType hospitalType;
	
	
	@ManyToOne
	@JoinColumn(name="townShip_id")
	private TownShip townShip;
	
	
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
	
	public HospitalCategory getHospitalCategory() {
		return hospitalCategory;
	}
	public void setHospitalCategory(HospitalCategory hospitalCategory) {
		this.hospitalCategory = hospitalCategory;
	}
	
	public HospitalType getHospitalType() {
		return hospitalType;
	}
	public void setHospitalType(HospitalType hospitalType) {
		this.hospitalType = hospitalType;
	}
	
	public TownShip getTownShip() {
		return townShip;
	}
	public void setTownShip(TownShip townShip) {
		this.townShip = townShip;
	}
	
	
	@OneToMany(mappedBy = "hospital")
	private List<Booking> booking;
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	
	
	@OneToMany(mappedBy="hospital")
	private List<Reviews> reviews;
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	
	
	@OneToMany (mappedBy="hospital")
	private List<HospitalSpecial> hospitalSpeciality;
	public List<HospitalSpecial> getHospitalSpeciality() {
		return hospitalSpeciality;
	}
	public void setHospitalSpeciality(List<HospitalSpecial> hospitalSpeciality) {
		this.hospitalSpeciality = hospitalSpeciality;
	}
	
	
	@OneToMany(mappedBy = "hospital")
	private List<HospitalDoctor> hospitalDoctor;
	public List<HospitalDoctor> getHospitalDoctor() {
		return hospitalDoctor;
	}
	public void setHospitalDoctor(List<HospitalDoctor> hospitalDoctor) {
		this.hospitalDoctor = hospitalDoctor;
	}	
	
	
}
