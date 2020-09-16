package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDetail;
import com.htet.ucs.HealthCareServices.repository.HospitalDetailRepository;

@Service
public class HospitalDetailService implements HospitalDetailInterface{
	@Autowired
	private HospitalDetailRepository hospitalDetailRepository;
	@Override
	public void saveHospitalDetail(HospitalDetailDTO hospitalDetailDTO) {
		// TODO Auto-generated method stub
		hospitalDetailRepository.save(convertHospitalDetail(hospitalDetailDTO));
	}

	@Override
	public List<HospitalDetailDTO> getAllHospitalDetailList() {
		// TODO Auto-generated method stub
		List<HospitalDetail> hd = hospitalDetailRepository.findAll();
		List<HospitalDetailDTO> hdDTO = hd.stream().map(h->convertHospitalDetailDTO(h)).collect(Collectors.toList());
		return hdDTO;
	}
	HospitalDetail convertHospitalDetail(HospitalDetailDTO hdDTO) {
		HospitalDetail hd = new HospitalDetail();
		hd.setPhone(hdDTO.getPhone());
		hd.setAddress(hdDTO.getAddress());
		hd.setDate(hdDTO.getDate());
		hd.setTime(hdDTO.getTime());
		hd.setHospital(hdDTO.getHospital());
		return hd;
	}
	
	HospitalDetailDTO convertHospitalDetailDTO(HospitalDetail hdDTO) {
		HospitalDetailDTO hd = new HospitalDetailDTO();
		hd.setPhone(hdDTO.getPhone());
		hd.setAddress(hdDTO.getAddress());
		hd.setDate(hdDTO.getDate());
		hd.setTime(hdDTO.getTime());
		hd.setHospital(hdDTO.getHospital());
		return hd;
	}
}
