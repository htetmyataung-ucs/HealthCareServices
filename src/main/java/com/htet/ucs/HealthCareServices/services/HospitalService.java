package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDTO;
import com.htet.ucs.HealthCareServices.model.Hospital;
import com.htet.ucs.HealthCareServices.repository.HospitalRepository;
@Service
public class HospitalService implements HospitalInterface{

	@Autowired
	private HospitalRepository hospitalRepository;
	@Override
	public void saveHospital(HospitalDTO dto) {
		// TODO Auto-generated method stub
		hospitalRepository.save(convertHospital(dto));
	}

	@Override
	public List<HospitalDTO> getAllHospitalList() {
		// TODO Auto-generated method stub
		List<Hospital> hList = hospitalRepository.findAll();
		List<HospitalDTO> dtoList = hList.stream().map(h->convertHospitalDTO(h)).collect(Collectors.toList());
		return dtoList;
	}
	
	Hospital convertHospital(HospitalDTO dto) {
		Hospital h = new Hospital();
		h.setName(dto.getName());
		h.setHospitalCategory(dto.getHospitalCategory());
		h.setHospitalType(dto.getHospitalType());
		h.setTownShip(dto.getTownShip());
		h.setBooking(dto.getBooking());
		h.setReviews(dto.getReviews());
		h.setHospitalSpeciality(dto.getHospitalSpeciality());
		h.setHospitalDoctor(dto.getHospitalDoctor());
		return h;
	}
	
	HospitalDTO convertHospitalDTO(Hospital h) {
		HospitalDTO hdto = new HospitalDTO();
		hdto.setName(h.getName());
		hdto.setHospitalCategory(h.getHospitalCategory());
		hdto.setHospitalType(h.getHospitalType());
		hdto.setTownShip(h.getTownShip());
		hdto.setBooking(h.getBooking());
		hdto.setReviews(h.getReviews());
		hdto.setHospitalSpeciality(h.getHospitalSpeciality());
		hdto.setHospitalDoctor(h.getHospitalDoctor());
		return hdto;
	}

}
