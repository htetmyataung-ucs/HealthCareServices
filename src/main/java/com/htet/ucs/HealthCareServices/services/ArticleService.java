package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.repository.ArticleRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ArticleConverter;

@Service
public class ArticleService implements ArticleInterface{
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public void saveArtical(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		articleRepository.save(ArticleConverter.convertToEntity(articleDTO));
	}

	@Override
	public List<ArticleDTO> getAllArticleList() {
		// TODO Auto-generated method stub
		return articleRepository.findAll().stream().map(ArticleConverter::convertToDTO).collect(Collectors.toList());
	}
	
}
