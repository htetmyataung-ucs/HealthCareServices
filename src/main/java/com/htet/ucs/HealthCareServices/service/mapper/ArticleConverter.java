package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.model.Article;

public class ArticleConverter {

	public static Article fromDTO(ArticleDTO dto) {
		Article art=new Article();
		return art;
	}
	public static Article fromId(Long id) {
		Article art=new Article();
		art.setId(id);
		return art;
	}
}
