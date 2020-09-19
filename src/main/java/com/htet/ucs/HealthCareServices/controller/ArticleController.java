package com.htet.ucs.HealthCareServices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.services.ArticleInterface;


@Controller
public class ArticleController{
	@Autowired
	private ArticleInterface articleInterface;
	
	//************ARTICLE*************
	
	@GetMapping("/create_article")
	public String createArticel(Model model) {
		model.addAttribute("article", new ArticleDTO());
		return "article";
	}
	@PostMapping("/create_article")
	public String saveArticle(@ModelAttribute("article") ArticleDTO a,Model model) {		
		articleInterface.saveArtical(a);	
		return "redirect:/article_list";
	}
	@GetMapping("article_list")
	public String articleList(Model model) {
		model.addAttribute("articles", articleInterface.getAllArticleList());
		return "article_list";
	}
	
	
}
