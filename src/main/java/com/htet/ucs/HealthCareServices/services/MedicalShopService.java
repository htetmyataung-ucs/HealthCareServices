 package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.repository.MedicalShopRepository;
import com.htet.ucs.HealthCareServices.service.mapper.MedicalShopConverter;
@Service
public class MedicalShopService implements MedicalShopInterface{
	@Autowired
	private MedicalShopRepository medicalShopRepository;
	
	public void saveMedicalShop(MedicalShopDTO medicalShopdto) {
		medicalShopRepository.save(MedicalShopConverter.convertToEntity(medicalShopdto));
	}

	public List<MedicalShopDTO> getMedicalShopList() {
		return medicalShopRepository.findAll().stream().map(MedicalShopConverter::convertToDTO).collect(Collectors.toList());
	}

}
