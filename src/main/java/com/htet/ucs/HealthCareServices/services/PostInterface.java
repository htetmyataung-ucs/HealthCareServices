package com.htet.ucs.HealthCareServices.services;

import java.util.List;

import com.htet.ucs.HealthCareServices.dto.PostDTO;

public interface PostInterface {
	void postSave(PostDTO dto);
	List<PostDTO> getAllPostList();
	List<PostDTO> getAllOrderByDate();
}
