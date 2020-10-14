package com.htet.ucs.HealthCareServices.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalDetailDTO;
import com.htet.ucs.HealthCareServices.model.HospitalDetail;
import com.htet.ucs.HealthCareServices.repository.HospitalDetailRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalDetailConverter;

@Service
public class HospitalDetailService implements HospitalDetailInterface {

	@Autowired
	private HospitalDetailRepository hospitalDetailRepository;
	@Autowired
	ServletContext servletContext;
	public String UPLOAD_DIRECTORY = "/images/";

	@Override
	public void saveHospitalDetail(HospitalDetailDTO hospitalDetailDTO) {
		// TODO Auto-generated method stub
		if (hospitalDetailDTO != null) {
			HospitalDetail hd = new HospitalDetail();
			String path = servletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename = hospitalDetailDTO.getFile().getOriginalFilename();
			System.out.println(path + " " + filename);

			try {
				byte[] bytes = hospitalDetailDTO.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			if (hospitalDetailDTO.getId() != null) {
				hd.setId(hospitalDetailDTO.getId());
			}
			hd.setPhone(hospitalDetailDTO.getPhone());
			hd.setAddress(hospitalDetailDTO.getAddress());
			hd.setEmail(hospitalDetailDTO.getEmail());
			hd.setDate(hospitalDetailDTO.getDate());
			hd.setTime(hospitalDetailDTO.getTime());
			hd.setLatitude(hospitalDetailDTO.getLatitude());
			hd.setLongitude(hospitalDetailDTO.getLongitude());
			hd.getHospital().setId(hospitalDetailDTO.getHospitalId());
			hd.setPhotoPath(filename);
			hospitalDetailRepository.save(hd);
		}
		// hospitalDetailRepository.save(HospitalDetailConverter.convertToEntity(hospitalDetailDTO));
	}

	@Override
	public List<HospitalDetailDTO> getAllHospitalDetailList() {
		// TODO Auto-generated method stub
		return hospitalDetailRepository.findAll().stream().map(HospitalDetailConverter::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public HospitalDetailDTO findById(Long id) {
		// TODO Auto-generated method stub
		HospitalDetailDTO dto = HospitalDetailConverter.convertToDTO(hospitalDetailRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hospitalDetailRepository.deleteById(id);
	}

	@Override
	public HospitalDetailDTO findByHospitalId(Long id) {
		// TODO Auto-generated method stub
		//return hospitalDetailRepository.findDetailByHospitalId(id).stream().map(HospitalDetailConverter::convertToDTO).collect(Collectors.toList());
		HospitalDetailDTO dto = HospitalDetailConverter.convertToDTO(hospitalDetailRepository.findDetailByHospitalId(id));
		return dto;
	}


}
