 package com.htet.ucs.HealthCareServices.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.MedicalShopDTO;
import com.htet.ucs.HealthCareServices.model.MedicalShop;
import com.htet.ucs.HealthCareServices.repository.MedicalShopRepository;
import com.htet.ucs.HealthCareServices.service.mapper.MedicalShopConverter;
@Service
public class MedicalShopService implements MedicalShopInterface{
	@Autowired
	private MedicalShopRepository medicalShopRepository;
	@Autowired
	ServletContext servletContext;
	public String UPLOAD_DIRECTORY="/images/";
	
	public void saveMedicalShop(MedicalShopDTO medicalShopdto) {
		if(medicalShopdto!=null) {
			MedicalShop medicalShop = new MedicalShop();
			String path=servletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename=medicalShopdto.getFile().getOriginalFilename();
			System.out.println(path+" "+filename);
			try {
				byte[] bytes = medicalShopdto.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(
						new File(path+File.separator+filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			if(medicalShopdto.getId()!=null) {
				medicalShop.setId(medicalShopdto.getId());
			}
			medicalShop.setName(medicalShopdto.getName());
			medicalShop.setPhone(medicalShopdto.getPhone());
			medicalShop.setEmail(medicalShopdto.getEmail());
			medicalShop.setLatitude(medicalShopdto.getLatitude());
			medicalShop.setLongitude(medicalShopdto.getLongitude());
			medicalShop.setAddress(medicalShopdto.getAddress());
			medicalShop.getTownShip().setId(medicalShopdto.getTownshipId());
			medicalShop.setPhoto(filename);
			medicalShopRepository.save(medicalShop);
		}
	}

	public List<MedicalShopDTO> getMedicalShopList() {
		return medicalShopRepository.findAll().stream().map(MedicalShopConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public List<MedicalShopDTO> getShopListByTownship(Long id) {
		// TODO Auto-generated method stub
		return medicalShopRepository.findMedicalShopByTownship(id).stream().map(MedicalShopConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public MedicalShopDTO findById(Long id) {
		// TODO Auto-generated method stub
		MedicalShopDTO dto = MedicalShopConverter.convertToDTO(medicalShopRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicalShopRepository.deleteById(id);	
	}

}
