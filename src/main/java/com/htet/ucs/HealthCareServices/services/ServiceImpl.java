package com.htet.ucs.HealthCareServices.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ServiceDTO;
import com.htet.ucs.HealthCareServices.repository.ServiceRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ServiceConverter;

@Service
public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	private ServiceRepository serviceRepository;
	@Autowired
	ServletContext servletContext;
	public String UPLOAD_DIRECTORY = "/images/";

	@Override
	public void saveService(ServiceDTO dto) {
		// TODO Auto-generated method stub
		if (dto != null) {
			com.htet.ucs.HealthCareServices.model.Service s = new com.htet.ucs.HealthCareServices.model.Service();
			String path = servletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename = dto.getFile().getOriginalFilename();
			System.out.println(path + " " + filename);

			try {
				byte[] bytes = dto.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			if (dto.getId() != null) {
				s.setId(dto.getId());
			}
			s.setPhoto(filename);
			s.setName(dto.getName());
			s.setDescription(dto.getDescription());
			serviceRepository.save(s);
		}
	}

	@Override
	public List<ServiceDTO> getAllServiceList() {
		// TODO Auto-generated method stub
		return serviceRepository.findAll().stream().map(ServiceConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public ServiceDTO findById(Long id) {
		// TODO Auto-generated method stub
		ServiceDTO dto = ServiceConverter.convertToDTO(serviceRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		serviceRepository.deleteById(id);
	}

}
