package com.htet.ucs.HealthCareServices.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PostComment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String comment;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "parent_id")
	private PostComment parent;
	
	@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
	private List<PostComment> childComment = new ArrayList<PostComment>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public PostComment getParent() {
		return parent;
	}

	public void setParent(PostComment parent) {
		this.parent = parent;
	}
	
	
	public List<PostComment> getChildComment() {
		return childComment;
	}

	public void setChildComment(List<PostComment> childComment) {
		this.childComment = childComment;
	}


	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "post_id")
	private Post post = new Post();

	
	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public PostComment() {
		super();
	}
		
}
