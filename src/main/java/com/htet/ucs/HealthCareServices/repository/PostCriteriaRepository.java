package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import com.htet.ucs.HealthCareServices.model.Post;


public interface PostCriteriaRepository {
	public List<Post> getLatestPosts();
}
