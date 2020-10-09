package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.ArticleDetail;


@Repository
public interface ArticleDetailRepository  extends JpaRepository<ArticleDetail, Long>   {

	@Query("select ad from ArticleDetail ad where ad.article.name=?1")
	List<ArticleDetail> findDetailByArticleName(String name);
}
