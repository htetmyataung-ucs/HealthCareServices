package com.htet.ucs.HealthCareServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.services.ArticleDetailInterface;
import com.htet.ucs.HealthCareServices.services.ArticleInterface;

@Controller
public class ArticleDetailController {
	@Autowired
	private ArticleInterface articleInterface;
	@Autowired
	private ArticleDetailInterface articleDetailInterface;
	
	//***********ARTICLE DETAIL*************
	
		@GetMapping("/create_article_detail")
		public String createArticelDetail(Model model) {
			model.addAttribute("articleList", articleInterface.getAllArticleList());
			model.addAttribute("article_detail", new ArticleDetailDTO());
			return "article_detail";
		}
		
		@PostMapping("/create_article_detail")
		public String saveArticleDetail(@ModelAttribute("article_detail") ArticleDetailDTO ad, Model model) {		
//			System.out.println("Artical "+ad.getGender());
//			System.out.println("Desc "+ad.getDescription());
//			//articleDetailRepositroy.save(ad);		
//			ArticleDetail aa = new ArticleDetail();
//			aa.setName(ad.getName());
//			aa.setDescription(ad.getDescription());
//			aa.setGender(ad.getGender());
//			articleDetailRepositroy.save(aa);
			articleDetailInterface.saveArticlDetail(ad);
			return "redirect:/articledetail_list";
		}
		@GetMapping("/articledetail_list")
		public String articleDetailList(Model model) {
			model.addAttribute("article_details", articleDetailInterface.getAllArticleDetailList());
			return "article_detail_list";
		}
}