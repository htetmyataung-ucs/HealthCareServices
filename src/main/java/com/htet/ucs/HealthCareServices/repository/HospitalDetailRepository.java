package com.htet.ucs.HealthCareServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;

import com.htet.ucs.HealthCareServices.model.HospitalDetail;

@Controller
public interface HospitalDetailRepository extends JpaRepository<HospitalDetail	, Long>{
	
	@Query("select hd from HospitalDetail hd where hd.hospital.id=?1")
	HospitalDetail findDetailByHospitalId(Long id);
}
