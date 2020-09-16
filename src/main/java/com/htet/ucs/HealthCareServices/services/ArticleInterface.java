package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;

public interface ArticleInterface {
	void saveArtical(ArticleDTO articleDTO);
	List<ArticleDTO>  getAllArticleList();
}
