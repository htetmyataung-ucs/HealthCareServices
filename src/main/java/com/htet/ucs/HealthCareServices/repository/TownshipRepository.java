package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.TownShip;

@Repository
public interface TownshipRepository extends JpaRepository<TownShip, Long>{
	@Query("select c from TownShip c where c.name=?1")
	TownShip findByTownShipName(String name);
	
	@Query("select c from TownShip c where c.city.id=?1")
	List<TownShip> findTownShipByCity(Long cityId);
	
}
