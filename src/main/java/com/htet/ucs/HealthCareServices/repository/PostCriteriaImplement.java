package com.htet.ucs.HealthCareServices.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.htet.ucs.HealthCareServices.model.Post;

@Repository
public class PostCriteriaImplement implements PostCriteriaRepository{
	
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Post> getLatestPosts() {
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Post> cq = cb.createQuery(Post.class);
//		Root<Post> p = cq.from(Post.class);
//		//cq.orderBy(cb.asc(p.get("date")));
//		TypedQuery<Post> query = em.createQuery(cq);
//		List<Post> posts = query.getResultList();
//		return posts;
		return null;
	}

}
