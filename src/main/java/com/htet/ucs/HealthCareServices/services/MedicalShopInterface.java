package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;

public interface MedicalShopInterface {
	//to set
	void saveMedicalShop(MedicalShopDTO medicalShopdto);
	//to get
	List<MedicalShopDTO> getMedicalShopList();
	//search by township id
	List<MedicalShopDTO> getShopListByTownship(Long id);
	//to edit
	MedicalShopDTO findById(Long id);
	//to delete
	void delete(Long id);
}
