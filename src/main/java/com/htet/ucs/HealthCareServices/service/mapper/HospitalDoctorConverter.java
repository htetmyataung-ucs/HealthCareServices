package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.HospitalDoctorDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDoctor;

public class HospitalDoctorConverter {
	public static HospitalDoctor convertToEntity(HospitalDoctorDTO hDTO) {
		HospitalDoctor hospitalDoctor = new HospitalDoctor();
		if(hDTO.getId()!=null) {
			hospitalDoctor.setId(hDTO.getId());
		}
		hospitalDoctor.getDoctor().setId(hDTO.getDoctorId());
		hospitalDoctor.getHospital().setId(hDTO.getHospitalId());
		hospitalDoctor.setStartDate(hDTO.getStartDate());
		hospitalDoctor.setEndDate(hDTO.getEndDate());
		hospitalDoctor.setStartTime(hDTO.getStartTime());
		hospitalDoctor.setEndTime(hDTO.getEndTime());
		hospitalDoctor.setStatus(hDTO.getStatus());
		return hospitalDoctor;
	}
	public static HospitalDoctorDTO convertToDTO(HospitalDoctor hDTO) {
		HospitalDoctorDTO hospitalDoctor = new HospitalDoctorDTO();
		hospitalDoctor.setId(hDTO.getId());
		hospitalDoctor.setDoctorName(hDTO.getDoctor().getName());
		hospitalDoctor.setHospitalName(hDTO.getHospital().getName());
		hospitalDoctor.setStartDate(hDTO.getStartDate());
		hospitalDoctor.setEndDate(hDTO.getEndDate());
		hospitalDoctor.setStartTime(hDTO.getStartTime());
		hospitalDoctor.setEndTime(hDTO.getEndTime());
		hospitalDoctor.setStatus(hDTO.getStatus());
		return hospitalDoctor;
	}
	
}
