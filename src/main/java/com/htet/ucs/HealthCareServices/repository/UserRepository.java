package com.htet.ucs.HealthCareServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
