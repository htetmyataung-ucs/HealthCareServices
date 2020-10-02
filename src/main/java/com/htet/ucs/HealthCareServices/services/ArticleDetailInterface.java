package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;

public interface ArticleDetailInterface {
	//to set
	void saveArticlDetail(ArticleDetailDTO articleDTO);
	//to get
	List<ArticleDetailDTO> getAllArticleDetailList();
	//to edit
	ArticleDetailDTO findById(Long id);
	//to delete
	void delete(Long id);
}
