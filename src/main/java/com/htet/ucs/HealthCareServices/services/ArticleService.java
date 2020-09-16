package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.model.Article;
import com.htet.ucs.HealthCareServices.repository.ArticleRepository;

@Service
public class ArticleService implements ArticleInterface{
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public void saveArtical(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		articleRepository.save(convertArticle(articleDTO));
	}

	@Override
	public List<ArticleDTO> getAllArticleList() {
		// TODO Auto-generated method stub
		List<Article> a = articleRepository.findAll();
		List<ArticleDTO> aDTO = a.stream().map(s->convertArticleDTO(s)).collect(Collectors.toList());
		return aDTO;
	}
	Article convertArticle(ArticleDTO articleDTO) {
		Article a = new Article();
		a.setName(articleDTO.getName());
		a.setArticledetailList(articleDTO.getArticledetailList());
		return a;
	}
	ArticleDTO convertArticleDTO(Article articleDTO) {
		ArticleDTO a = new ArticleDTO();
		a.setName(articleDTO.getName());
		a.setArticledetailList(articleDTO.getArticledetailList());
		return a;
	}
	
}
