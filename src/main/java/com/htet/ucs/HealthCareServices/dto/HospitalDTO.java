package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.List;

import com.htet.ucs.HealthCareServices.model.Booking;
import com.htet.ucs.HealthCareServices.model.HospitalCategory;
import com.htet.ucs.HealthCareServices.model.HospitalDoctor;
import com.htet.ucs.HealthCareServices.model.HospitalSpecial;
import com.htet.ucs.HealthCareServices.model.HospitalType;
import com.htet.ucs.HealthCareServices.model.Reviews;
import com.htet.ucs.HealthCareServices.model.TownShip;

public class HospitalDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	private HospitalCategory hospitalCategory;
	private Long hospitalCategoryId;
	private String hospitalCategoryName;
	
	private HospitalType hospitalType;
	private Long hospitalTypeId;
	private String hospitalTypeName;
	
	private TownShip townShip;
	private Long townShipId;
	private String townShipName;
	
	private List<Booking> booking;
	private List<Reviews> reviews;
	private List<HospitalSpecial> hospitalSpeciality;
	private List<HospitalDoctor> hospitalDoctor;
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
	public List<Booking> getBooking() {
		return booking;
	}
	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	public List<HospitalSpecial> getHospitalSpeciality() {
		return hospitalSpeciality;
	}
	public void setHospitalSpeciality(List<HospitalSpecial> hospitalSpeciality) {
		this.hospitalSpeciality = hospitalSpeciality;
	}
	public List<HospitalDoctor> getHospitalDoctor() {
		return hospitalDoctor;
	}
	public void setHospitalDoctor(List<HospitalDoctor> hospitalDoctor) {
		this.hospitalDoctor = hospitalDoctor;
	}
	public Long getHospitalCategoryId() {
		return hospitalCategoryId;
	}
	public void setHospitalCategoryId(Long hospitalCategoryId) {
		this.hospitalCategoryId = hospitalCategoryId;
	}
	public String getHospitalCategoryName() {
		return hospitalCategoryName;
	}
	public void setHospitalCategoryName(String hospitalCategoryName) {
		this.hospitalCategoryName = hospitalCategoryName;
	}
	public Long getHospitalTypeId() {
		return hospitalTypeId;
	}
	public void setHospitalTypeId(Long hospitalTypeId) {
		this.hospitalTypeId = hospitalTypeId;
	}
	public String getHospitalTypeName() {
		return hospitalTypeName;
	}
	public void setHospitalTypeName(String hospitalTypeName) {
		this.hospitalTypeName = hospitalTypeName;
	}
	public Long getTownShipId() {
		return townShipId;
	}
	public void setTownShipId(Long townShipId) {
		this.townShipId = townShipId;
	}
	public String getTownShipName() {
		return townShipName;
	}
	public void setTownShipName(String townShipName) {
		this.townShipName = townShipName;
	}
	
	
}
