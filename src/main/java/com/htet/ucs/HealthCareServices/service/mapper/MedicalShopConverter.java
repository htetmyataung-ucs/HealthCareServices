package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.model.MedicalShop;

public class MedicalShopConverter {
	public static MedicalShop convertToEntity(MedicalShopDTO shopDTO) {
		MedicalShop medicalShop=new MedicalShop();
		medicalShop.setName(shopDTO.getName());
		medicalShop.setPhone(shopDTO.getPhone());
		medicalShop.setAddress(shopDTO.getAddress());
		medicalShop.setTownShip(shopDTO.getTownShip());
		return medicalShop;
	}
	public static MedicalShopDTO convertToDTO(MedicalShop medicalShop) {
		MedicalShopDTO shopDTO= new MedicalShopDTO();
		shopDTO.setId(medicalShop.getId());
		shopDTO.setName(medicalShop.getName());
		shopDTO.setPhone(medicalShop.getPhone());
		shopDTO.setAddress(medicalShop.getAddress());
		shopDTO.setTownShip(medicalShop.getTownShip());
		return shopDTO;
	}

}
