package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long>{
	@Query("select h from Hospital h where h.townShip.id=?1 and h.hospitalCategory.id=?2 and h.hospitalType.id=?3")
	List<Hospital> findHospitalByAllCat(Long townshipId, Long hospitalCategoryId, Long hospitalTypeId);

}
