package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.repository.ArticleDetailRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ArticleDetailConverter;

@Service
public class ArticleDetailService implements ArticleDetailInterface{
	@Autowired
	private ArticleDetailRepository articleDetailRepository;
	
	@Override
	public void saveArticlDetail(ArticleDetailDTO articleDTO) {
		// TODO Auto-generated method stub
		articleDetailRepository.save(ArticleDetailConverter.convertToEntity(articleDTO));
	}

	@Override
	public List<ArticleDetailDTO> getAllArticleDetailList() {
		// TODO Auto-generated method stub
		return articleDetailRepository.findAll().stream().map(ArticleDetailConverter::convertToDTO).collect(Collectors.toList());
	}

}
