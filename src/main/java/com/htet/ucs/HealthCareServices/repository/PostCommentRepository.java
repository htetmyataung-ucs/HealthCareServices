package com.htet.ucs.HealthCareServices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.htet.ucs.HealthCareServices.model.PostComment;

@Controller
public interface PostCommentRepository extends JpaRepository<PostComment, Long>{

}
