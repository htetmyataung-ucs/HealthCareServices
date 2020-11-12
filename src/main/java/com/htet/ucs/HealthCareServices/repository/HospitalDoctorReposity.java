package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.HospitalDoctor;

@Repository
public interface HospitalDoctorReposity extends JpaRepository<HospitalDoctor, Long>{

	@Query("select hd from HospitalDoctor hd where hd.hospital.id=?1")
	List<HospitalDoctor> findDoctorByHospitalId(Long id);
}
