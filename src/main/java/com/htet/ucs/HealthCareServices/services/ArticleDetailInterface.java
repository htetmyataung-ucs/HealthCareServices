package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;

public interface ArticleDetailInterface {
	void saveArticlDetail(ArticleDetailDTO articleDTO);
	List<ArticleDetailDTO> getAllArticleDetailList();
}
