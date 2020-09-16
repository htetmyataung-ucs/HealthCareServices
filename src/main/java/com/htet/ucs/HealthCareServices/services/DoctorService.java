package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.model.Doctor;
import com.htet.ucs.HealthCareServices.repository.DoctorRepository;

@Service
public class DoctorService implements DoctorInterface{
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public void saveDoctor(DoctorDTO doctorDTO) {
		doctorRepository.save(convertDoctor(doctorDTO));
	}

	@Override
	public List<DoctorDTO> getAllDoctorList() {
		List<Doctor> doctorList= doctorRepository.findAll();
		List<DoctorDTO> doctorDTOList=doctorList.stream().map(d->convertDoctorDTO(d)).collect(Collectors.toList());
		return doctorDTOList;
	}
	
	Doctor convertDoctor(DoctorDTO doctorDTO) {
		Doctor doctor=new Doctor();
		doctor.setName(doctorDTO.getName());
		doctor.setSama_no(doctorDTO.getSama_no());
		doctor.setSpeciality(doctorDTO.getSpeciality());
		doctor.setHospitalDoctor(doctorDTO.getHospitalDoctor());
		return doctor;
	}
	DoctorDTO convertDoctorDTO(Doctor doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setName(doctor.getName());
		doctorDTO.setSama_no(doctor.getSama_no());
		doctorDTO.setSpeciality(doctor.getSpeciality());
		doctorDTO.setHospitalDoctor(doctor.getHospitalDoctor());
		return doctorDTO;
	}

}
