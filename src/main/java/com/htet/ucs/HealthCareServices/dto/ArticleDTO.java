package com.htet.ucs.HealthCareServices.dto;

import java.io.Serializable;
import java.util.Set;

import com.htet.ucs.HealthCareServices.model.ArticleDetail;

public class ArticleDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Set<ArticleDetail> articledetailList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<ArticleDetail> getArticledetailList() {
		return articledetailList;
	}
	public void setArticledetailList(Set<ArticleDetail> articledetailList) {
		this.articledetailList = articledetailList;
	}
	
}
