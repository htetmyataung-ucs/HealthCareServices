package com.htet.ucs.HealthCareServices.services;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.CityDTO;
import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.model.TownShip;
import com.htet.ucs.HealthCareServices.repository.TownshipRepository;
@Service
public class TownshipService implements TownshipInterface{
    @Autowired
    private TownshipRepository townshipRepository;
	@Override
	public void saveTownship(TownshipDTO townshipDTO) {
		// TODO Auto-generated method stub
		townshipRepository.save(convertTownship(townshipDTO));
	}

	@Override
	public List<TownshipDTO> getAllTownshipList() {
		// TODO Auto-generated method stub
		List<TownShip> tList = townshipRepository.findAll();
		List<TownshipDTO> dtoList=tList.stream().map(t->convertTownshipDTO(t)).collect(Collectors.toList());		
		return null;
	}
	
	TownShip convertTownship(TownshipDTO dto) {
		TownShip t = new TownShip();
		t.setName(dto.getName());
		t.setCity(dto.getCity());
		t.setHospital(dto.getHospital());
		return t;
	}
	
	TownshipDTO convertTownshipDTO(TownShip t) {
		TownshipDTO towndto=new TownshipDTO();
		towndto.setName(t.getName());
		towndto.setCity(t.getCity());
		towndto.setHospital(t.getHospital());
		return towndto;
	}

}
