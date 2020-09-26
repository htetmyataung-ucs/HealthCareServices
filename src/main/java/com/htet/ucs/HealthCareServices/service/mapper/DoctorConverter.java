   package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.model.Doctor;

public class DoctorConverter {
	public static Doctor convertToEntity(DoctorDTO doctorDTO) {
		Doctor doctor=new Doctor();
		doctor.setName(doctorDTO.getName());
		doctor.setSama_no(doctorDTO.getSama_no());
		doctor.setSpeciality(doctorDTO.getSpeciality());
		doctor.setHospitalDoctor(doctorDTO.getHospitalDoctor());
		return doctor;
	}
	public static DoctorDTO convertToDTO(Doctor doctor) {
		DoctorDTO doctorDTO = new DoctorDTO();
		doctorDTO.setId(doctor.getId());
		doctorDTO.setName(doctor.getName());
		doctorDTO.setSama_no(doctor.getSama_no());
		doctorDTO.setSpeciality(doctor.getSpeciality());
		doctorDTO.setHospitalDoctor(doctor.getHospitalDoctor());
		doctorDTO.setPhotoPath(doctor.getPhotoPath());
		return doctorDTO;
	}
}
