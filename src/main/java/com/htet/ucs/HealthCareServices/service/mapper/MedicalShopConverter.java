package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.model.MedicalShop;

public class MedicalShopConverter {
//	public static MedicalShop convertToEntity(MedicalShopDTO shopDTO) {
//		MedicalShop medicalShop=new MedicalShop();
//		if(shopDTO.getId()!=null) {
//			medicalShop.setId(shopDTO.getId());
//		}
//		medicalShop.setName(shopDTO.getName());
//		medicalShop.setPhone(shopDTO.getPhone());
//		medicalShop.setEmail(shopDTO.getEmail());
//		medicalShop.setAddress(shopDTO.getAddress());
//		medicalShop.getTownShip().setId(shopDTO.getTownshipId());
//		return medicalShop;
//	}
	public static MedicalShopDTO convertToDTO(MedicalShop medicalShop) {
		MedicalShopDTO shopDTO= new MedicalShopDTO();
		shopDTO.setId(medicalShop.getId());
		shopDTO.setName(medicalShop.getName());
		shopDTO.setPhone(medicalShop.getPhone());
		shopDTO.setEmail(medicalShop.getEmail());
		shopDTO.setLatitude(medicalShop.getLatitude());
		shopDTO.setLongitude(medicalShop.getLongitude());
		shopDTO.setPhoto(medicalShop.getPhoto());
		shopDTO.setAddress(medicalShop.getAddress());
		shopDTO.setTownshipId(medicalShop.getTownShip().getId());
		shopDTO.setTownshipName(medicalShop.getTownShip().getName());
		return shopDTO;
	}

}
