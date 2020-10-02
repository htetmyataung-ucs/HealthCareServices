package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.model.ArticleDetail;

public class ArticleDetailConverter {
	public static ArticleDetail convertToEntity(ArticleDetailDTO adDTO) {
		ArticleDetail ad = new ArticleDetail();
		if(adDTO.getId()!=null) {
			ad.setId(adDTO.getId());
		}
		ad.setName(adDTO.getName());
		ad.setDescription(adDTO.getDescription());
		ad.setGender(adDTO.getGender());
		ad.getArticle().setId(adDTO.getArticleId());
		return ad;
	}
	public static ArticleDetailDTO convertToDTO(ArticleDetail adDTO) {
		ArticleDetailDTO ad = new ArticleDetailDTO();
		ad.setId(adDTO.getId());
		ad.setName(adDTO.getName());
		ad.setDescription(adDTO.getDescription());
		ad.setGender(adDTO.getGender());
		ad.setArticleName(adDTO.getArticle().getName());
		return ad;
	}
}
