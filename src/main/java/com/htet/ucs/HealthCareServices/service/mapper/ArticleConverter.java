package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.model.Article;

public class ArticleConverter {

	public static Article fromDTO(ArticleDTO dto) {
		Article art=new Article();
		art.setName(dto.getName());
		art.setArticledetailList(dto.getArticledetailList());
		return art;
	}
	public static Article fromId(Long id) {
		Article art=new Article();
		art.setId(id);
		return art;
	}
	
	//************Main*************
	public static Article convertToEntity(ArticleDTO articleDTO) {
		Article a = new Article();
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
