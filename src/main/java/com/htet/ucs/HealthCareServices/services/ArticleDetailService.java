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

	@Override
	public ArticleDetailDTO findById(Long id) {
		// TODO Auto-generated method stub
		ArticleDetailDTO dto = ArticleDetailConverter.convertToDTO(articleDetailRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		articleDetailRepository.deleteById(id);
	}

	@Override
	public List<ArticleDetailDTO> findDetailsByArticleName(String name) {
		// TODO Auto-generated method stub
		return articleDetailRepository.findDetailByArticleName(name).stream().map(ArticleDetailConverter::convertToDTO).collect(Collectors.toList());
	}

}
