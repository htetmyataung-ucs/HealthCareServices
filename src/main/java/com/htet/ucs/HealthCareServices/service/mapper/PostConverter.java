package com.htet.ucs.HealthCareServices.service.mapper;

import com.htet.ucs.HealthCareServices.dto.PostDTO;
import com.htet.ucs.HealthCareServices.model.Post;

public class PostConverter {
	
	public static PostDTO convertToDTO(Post dto) {
		PostDTO p = new PostDTO();
		p.setId(dto.getId());
		p.setDescription(dto.getDescription());
		p.setUserName(dto.getUser().getName());
		return p;
	}
}
