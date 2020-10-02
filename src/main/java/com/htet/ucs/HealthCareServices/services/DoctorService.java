package com.htet.ucs.HealthCareServices.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.DoctorDTO;
import com.htet.ucs.HealthCareServices.model.Doctor;
import com.htet.ucs.HealthCareServices.repository.DoctorRepository;
import com.htet.ucs.HealthCareServices.service.mapper.DoctorConverter;

@Service
public class DoctorService implements DoctorInterface{
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	ServletContext servletContext;
	public String UPLOAD_DIRECTORY="/images/";
	
	@Override
	public void saveDoctor(DoctorDTO doctorDTO) {
		if(doctorDTO!=null) {
			Doctor d = new Doctor();
			String path=servletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename=doctorDTO.getFile().getOriginalFilename();
			System.out.println(path+" "+filename);
			try {
				byte[] bytes = doctorDTO.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
						new File(path+File.separator+filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			if(doctorDTO.getId()!=null) {
				d.setId(doctorDTO.getId());
			}
			d.setName(doctorDTO.getName());
			d.setSama_no(doctorDTO.getSama_no());
			d.getSpeciality().setId(doctorDTO.getSpecialityId());
			d.setPhotoPath(filename);
			d.setHospitalDoctor(doctorDTO.getHospitalDoctor());
			doctorRepository.save(d);
		}
		//doctorRepository.save(DoctorConverter.convertToEntity(doctorDTO));
	}

	@Override
	public List<DoctorDTO> getAllDoctorList() {
		return doctorRepository.findAll().stream().map(DoctorConverter::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public DoctorDTO findById(Long id) {
		// TODO Auto-generated method stub
		DoctorDTO dto = DoctorConverter.convertToDTO(doctorRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
	}
	
}
