package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.HospitalService;

@Repository
public interface HospitalServiceRepository extends JpaRepository<HospitalService, Long>{
	@Query("select hs from HospitalService hs where hs.hospital.id=?1")
	List<HospitalService> findHospitalServiceByHospitalId(Long id);
}
