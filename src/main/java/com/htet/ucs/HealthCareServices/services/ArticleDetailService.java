package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.model.ArticleDetail;
import com.htet.ucs.HealthCareServices.repository.ArticleDetailRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ArticleConverter;

@Service
public class ArticleDetailService implements ArticleDetailInterface{
	@Autowired
	private ArticleDetailRepository articleDetailRepository;
	
	@Override
	public void saveArticlDetail(ArticleDetailDTO articleDTO) {
		// TODO Auto-generated method stub
		articleDetailRepository.save(convertArticleDetail(articleDTO));
	}

	@Override
	public List<ArticleDetailDTO> getAllArticleDetailList() {
		// TODO Auto-generated method stub
		List<ArticleDetail> ad = articleDetailRepository.findAll();
		List<ArticleDetailDTO> adDTO = ad.stream().map(a->convertArticleDetailDTO(a)).collect(Collectors.toList());
		return adDTO;
	}

	ArticleDetail convertArticleDetail(ArticleDetailDTO adDTO) {
		ArticleDetail ad = new ArticleDetail();
		ad.setName(adDTO.getName());
		ad.setDescription(adDTO.getDescription());
		ad.setGender(adDTO.getGender());
		ad.setArticle(ArticleConverter.fromId(adDTO.getArticleId()));
		return ad;
	}
	ArticleDetailDTO convertArticleDetailDTO(ArticleDetail adDTO) {
		ArticleDetailDTO ad = new ArticleDetailDTO();
		ad.setName(adDTO.getName());
		ad.setDescription(adDTO.getDescription());
		ad.setGender(adDTO.getGender());
		ad.setArticleName(adDTO.getArticle().getName());
		return ad;
	}

}
