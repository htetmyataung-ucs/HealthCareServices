 package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.model.MedicalShop;
import com.htet.ucs.HealthCareServices.repository.MedicalShopRepository;
@Service
public class MedicalShopService implements MedicalShopInterface{
	@Autowired
	private MedicalShopRepository medicalShopRepository;
	
	public void saveMedicalShop(MedicalShopDTO medicalShopdto) {
		medicalShopRepository.save(convertMedicalShop(medicalShopdto));
	}

	public List<MedicalShopDTO> getMedicalShopList() {
		List<MedicalShop> medicalShopList= medicalShopRepository.findAll();
		List<MedicalShopDTO> shopDTOList= medicalShopList.stream().map(s->convertMedicalShopDTO(s)).collect(Collectors.toList());
		return shopDTOList;
	}
	MedicalShop convertMedicalShop(MedicalShopDTO shopDTO) {
		MedicalShop medicalShop=new MedicalShop();
		medicalShop.setName(shopDTO.getName());
		medicalShop.setPhone(shopDTO.getPhone());
		medicalShop.setAddress(shopDTO.getAddress());
		medicalShop.setTownShip(shopDTO.getTownShip());
		return medicalShop;
	}
	MedicalShopDTO convertMedicalShopDTO(MedicalShop medicalShop) {
		MedicalShopDTO shopDTO= new MedicalShopDTO();
		shopDTO.setName(medicalShop.getName());
		shopDTO.setPhone(medicalShop.getPhone());
		shopDTO.setAddress(medicalShop.getAddress());
		shopDTO.setTownShip(medicalShop.getTownShip());
		return shopDTO;
	}

}
