package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.MedicalShop;
@Repository
public interface MedicalShopRepository extends JpaRepository<MedicalShop, Long>{
	
	@Query("select c from MedicalShop c where c.townShip.id=?1")
	List<MedicalShop> findMedicalShopByTownship(Long townshipId);
	
}
