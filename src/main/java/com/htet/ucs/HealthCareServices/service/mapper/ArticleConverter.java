package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.model.Article;

public class ArticleConverter {

	
	//************Main*************
	public static Article convertToEntity(ArticleDTO articleDTO) {
		Article a = new Article();
		if(articleDTO.getId()!=null) {
			a.setId(articleDTO.getId());
		}
		a.setName(articleDTO.getName());
		a.setArticledetailList(articleDTO.getArticledetailList());
		return a;
	}
	public static ArticleDTO convertToDTO(Article article) {
		ArticleDTO aDTO = new ArticleDTO();
		aDTO.setId(article.getId());
		aDTO.setName(article.getName());
		aDTO.setArticledetailList(article.getArticledetailList());
		return aDTO;
	}
}
