package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;

public interface ArticleInterface {
	//to set
	void saveArtical(ArticleDTO articleDTO);
	//to get
	List<ArticleDTO>  getAllArticleList();
	//to edit
	ArticleDTO findById(Long id);
	//to delete
	void delete(Long id);
}
