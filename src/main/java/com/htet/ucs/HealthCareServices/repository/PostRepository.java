package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
	@Query("select p from Post p order by p.date desc")
	List<Post> findAllOrderByDate();
}
