package com.htet.ucs.HealthCareServices.articlemodel;

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
	
	@OneToMany(mappedBy = "article")
	private Set<Disease> diseaseList;
	public Set<Disease> getDiseaseList() {
		return diseaseList;
	}
	public void setDiseaseList(Set<Disease> diseaseList) {
		this.diseaseList = diseaseList;
	}
	
	@OneToMany(mappedBy = "article")
	private Set<FirstAid> firstAidList;
	public Set<FirstAid> getFirstAidList() {
		return firstAidList;
	}
	public void setFirstAidList(Set<FirstAid> firstAidList) {
		this.firstAidList = firstAidList;
	}
	
	@OneToMany(mappedBy = "article")
	private Set<Knowledge> knowledgeList;
	public Set<Knowledge> getKnowledgeList() {
		return knowledgeList;
	}
	public void setKnowledgeList(Set<Knowledge> knowledgeList) {
		this.knowledgeList = knowledgeList;
	}
}
