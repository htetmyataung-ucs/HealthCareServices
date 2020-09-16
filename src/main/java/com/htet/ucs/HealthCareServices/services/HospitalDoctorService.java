package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDoctor;
import com.htet.ucs.HealthCareServices.repository.HospitalDoctorReposity;

@Service
public class HospitalDoctorService implements HospitalDoctorInterface{
	@Autowired
	private HospitalDoctorReposity hospitalDoctorRepository;
	@Override
	public void saveHospitalDoctor(HospitalDoctorDTO hospitalDoctorDTO) {
		// TODO Auto-generated method stub
		hospitalDoctorRepository.save(convertHospitalDoctor(hospitalDoctorDTO));
	}

	@Override
	public List<HospitalDoctorDTO> getAllHospitalDoctorList() {
		// TODO Auto-generated method stub
		List<HospitalDoctor> hospitalDoctor= hospitalDoctorRepository.findAll();
		List<HospitalDoctorDTO> hospitalDoctorDTO = hospitalDoctor.stream().map(h->convertHospitalDoctorDTO(h)).collect(Collectors.toList());
		return hospitalDoctorDTO;
	}
	HospitalDoctor convertHospitalDoctor(HospitalDoctorDTO hDTO) {
		HospitalDoctor hospitalDoctor = new HospitalDoctor();
		hospitalDoctor.setDoctor(hDTO.getDoctor());
		hospitalDoctor.setHospital(hDTO.getHospital());
		hospitalDoctor.setStartDate(hDTO.getStartDate());
		hospitalDoctor.setEndDate(hDTO.getEndDate());
		hospitalDoctor.setStartTime(hDTO.getStartTime());
		hospitalDoctor.setEndTime(hDTO.getEndTime());
		hospitalDoctor.setStatus(hDTO.getStatus());
		return hospitalDoctor;
	}
	HospitalDoctorDTO convertHospitalDoctorDTO(HospitalDoctor hDTO) {
		HospitalDoctorDTO hospitalDoctor = new HospitalDoctorDTO();
		hospitalDoctor.setDoctor(hDTO.getDoctor());
		hospitalDoctor.setHospital(hDTO.getHospital());
		hospitalDoctor.setStartDate(hDTO.getStartDate());
		hospitalDoctor.setEndDate(hDTO.getEndDate());
		hospitalDoctor.setStartTime(hDTO.getStartTime());
		hospitalDoctor.setEndTime(hDTO.getEndTime());
		hospitalDoctor.setStatus(hDTO.getStatus());
		return hospitalDoctor;
	}
	

}
