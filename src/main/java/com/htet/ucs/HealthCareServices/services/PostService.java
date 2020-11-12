package com.htet.ucs.HealthCareServices.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.PostDTO;
import com.htet.ucs.HealthCareServices.model.Post;
import com.htet.ucs.HealthCareServices.repository.PostRepository;
import com.htet.ucs.HealthCareServices.service.mapper.PostConverter;

@Service
public class PostService implements PostInterface{
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private CurrentUserInterface currentUserInterface;
	@Override
	public void postSave(PostDTO dto) {
		// TODO Auto-generated method stub
		Post p = new Post();
		if(dto.getId()!=null) {
			p.setId(dto.getId());
		}
		p.setDescription(dto.getDescription());
		p.getUser().setId(currentUserInterface.getCurrentUser().getId());
		postRepository.save(p);
	}

	@Override
	public List<PostDTO> getAllPostList() {
		// TODO Auto-generated method stub
		return postRepository.findAll().stream().map(PostConverter::convertToDTO).collect(Collectors.toList());
	}

	@Override
	public List<PostDTO> getAllOrderByDate() {
		// TODO Auto-generated method stub
		return postRepository.findAllOrderByDate().stream().map(PostConverter::convertToDTO).limit(5).collect(Collectors.toList());
	}

}
