package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.HospitalServiceDTO;
import com.htet.ucs.HealthCareServices.dto.ManageHospitalServiceDTO;
import com.htet.ucs.HealthCareServices.model.HospitalService;
import com.htet.ucs.HealthCareServices.repository.HospitalServiceRepository;
import com.htet.ucs.HealthCareServices.service.mapper.HospitalServiceConverter;
@Service
public class HospitalServiceImpl implements HospitalServiceInterface{
	@Autowired
	private HospitalServiceRepository hospitalServiceRepository;
	@Override
	public void saveHospitalService(ManageHospitalServiceDTO dto) {
		// TODO Auto-generated method stub
		List<HospitalService> hospitalServiceList=dto.getServiceList().stream().filter(d->d.isSelected()==true).map(p->{
			HospitalService hs=new HospitalService();
			hs.getHospital().setId(dto.getHospitalId());
			hs.getService().setId(p.getId());
			return hs;
		}
		).collect(Collectors.toList());
		hospitalServiceRepository.saveAll(hospitalServiceList);
		hospitalServiceList.forEach(p->{
			System.out.println("Service Id :"+p.getService().getId());
		});
	}
	@Override
	public List<HospitalServiceDTO> getAllHospitalServiceList() {
		// TODO Auto-generated method stub
		return hospitalServiceRepository.findAll().stream().map(HospitalServiceConverter::convertToDTO).collect(Collectors.toList());
	}
	@Override
	public HospitalServiceDTO findById(Long id) {
		// TODO Auto-generated method stub
		HospitalServiceDTO dto = HospitalServiceConverter.convertToDTO(hospitalServiceRepository.findById(id).get());
		return dto;
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		hospitalServiceRepository.deleteById(id);
	}
	@Override
	public List<HospitalServiceDTO> findHospitalServiceByHospitalId(Long id) {
		// TODO Auto-generated method stub
		return hospitalServiceRepository.findHospitalServiceByHospitalId(id).stream().map(HospitalServiceConverter::toSearchHospitalService).collect(Collectors.toList());
	}
	

}
