package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;

public interface MedicalShopInterface {
	void saveMedicalShop(MedicalShopDTO medicalShopdto);
	List<MedicalShopDTO> getMedicalShopList();
}
