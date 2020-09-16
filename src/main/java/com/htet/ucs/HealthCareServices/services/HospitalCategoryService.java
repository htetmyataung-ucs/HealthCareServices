package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalCategoryDTO;
import com.htet.ucs.HealthCareServices.model.HospitalCategory;
import com.htet.ucs.HealthCareServices.repository.HospitalCategoryRepository;
@Service
public class HospitalCategoryService implements HospitalCategoryInterface{

	@Autowired
	private HospitalCategoryRepository hospitalcategoryRepository;
	@Override
	public void saveHospitalCategory(HospitalCategoryDTO dto) {
		// TODO Auto-generated method stub
		hospitalcategoryRepository.save(convertHospitalCategory(dto));
	}

	@Override
	public List<HospitalCategoryDTO> getAllHospitalCategoryList() {
		// TODO Auto-generated method stub
		List<HospitalCategory> hcList = hospitalcategoryRepository.findAll();
		List<HospitalCategoryDTO> dtoList=hcList.stream().map(hc->convertHospitalCategoryDTO(hc)).collect(Collectors.toList());
		return dtoList;
	}
	
	HospitalCategory convertHospitalCategory(HospitalCategoryDTO dto) {
		HospitalCategory hc = new HospitalCategory();
		hc.setName(dto.getName());
		hc.setHospital(dto.getHospital());
		return hc;
	}
	
	HospitalCategoryDTO convertHospitalCategoryDTO(HospitalCategory hc) {
		HospitalCategoryDTO hcdto = new HospitalCategoryDTO();
		hcdto.setName(hc.getName());
		hcdto.setHospital(hc.getHospital());
		return hcdto;
	}

}
