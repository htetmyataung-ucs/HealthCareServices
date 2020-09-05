package com.htet.ucs.HealthCareServices.articlemodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Disease implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "article_id")
	private Article article;
	private String feature;
	private String todo;
	private String toavoid;
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
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getTodo() {
		return todo;
	}
	public void setTodo(String todo) {
		this.todo = todo;
	}
	public String getToavoid() {
		return toavoid;
	}
	public void setToavoid(String toavoid) {
		this.toavoid = toavoid;
	}
	public Disease() {
		super();
	}
	public Disease(String name, Article article, String feature, String todo, String toavoid) {
		super();
		this.name = name;
		this.article = article;
		this.feature = feature;
		this.todo = todo;
		this.toavoid = toavoid;
	}
}
