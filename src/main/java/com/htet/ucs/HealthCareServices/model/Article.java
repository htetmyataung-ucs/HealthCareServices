package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Article implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Article(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Article(String name) {
		super();
		this.name = name;
	}
	public Article() {
		super();
	}
	@OneToMany(mappedBy="article")
	private Set<ArticleDetail> articledetailList;


	public Set<ArticleDetail> getArticledetailList() {
		return articledetailList;
	}
	public void setArticledetailList(Set<ArticleDetail> articledetailList) {
		this.articledetailList = articledetailList;
	}
	
}
