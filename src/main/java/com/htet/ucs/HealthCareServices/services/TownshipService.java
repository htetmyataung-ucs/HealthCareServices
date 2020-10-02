package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.TownshipDTO;
import com.htet.ucs.HealthCareServices.repository.TownshipRepository;
import com.htet.ucs.HealthCareServices.service.mapper.TownShipConverter;
@Service
public class TownshipService implements TownshipInterface{
    @Autowired
    private TownshipRepository townshipRepository;
	@Override
	public void saveTownship(TownshipDTO townshipDTO) {
		// TODO Auto-generated method stub
		townshipRepository.save(TownShipConverter.convertToEntity(townshipDTO));
	}

	@Override
	public List<TownshipDTO> getAllTownshipList() {
		// TODO Auto-generated method stub
		return townshipRepository.findAll().stream().map(TownShipConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public List<TownshipDTO> getTownshipListByCity(Long id) {
		// TODO Auto-gener ated method stub
		return townshipRepository.findTownShipByCity(id).stream().map(TownShipConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public TownshipDTO findById(Long id) {
		// TODO Auto-generated method stub
		TownshipDTO dto = TownShipConverter.convertToDTO(townshipRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		townshipRepository.deleteById(id);
	}

}
