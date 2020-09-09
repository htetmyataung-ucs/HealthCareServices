package com.htet.ucs.HealthCareServices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.model.Article;
import com.htet.ucs.HealthCareServices.model.ArticleDetail;
import com.htet.ucs.HealthCareServices.repository.ArticleDetailRepository;
import com.htet.ucs.HealthCareServices.repository.ArticleRepository;


@Controller
public class ArticleController{
	@Autowired
	private ArticleRepository articleRepositroy;
	@Autowired
	private ArticleDetailRepository articleDetailRepositroy;
		
	@GetMapping("/create_article")
	public String createArticel(Model model) {
		model.addAttribute("article", new Article());
		return "article";
	}
	
	@PostMapping("/save_article")
	public String saveArticle(@ModelAttribute("article") Article a,Model model) {		
		articleRepositroy.save(a);		
		model.addAttribute("articles", articleRepositroy.findAll());
		return "article_lsit";
	}
	
	@GetMapping("/create_article_detail")
	public String createArticelDetail(Model model) {
		model.addAttribute("articles", articleRepositroy.findAll());
		model.addAttribute("article_detail", new ArticleDetailDTO());
		return "article_detail";
	}
	
	@PostMapping("/save_article_detail")
	public String saveArticleDetail(@ModelAttribute("article_detail") ArticleDetailDTO ad, Model model) {		
		System.out.println("Artical "+ad.getGender());
		System.out.println("Desc "+ad.getDescription());
		//articleDetailRepositroy.save(ad);		
		ArticleDetail aa = new ArticleDetail();
		aa.setName(ad.getName());
		aa.setDescription(ad.getDescription());
		aa.setGender(ad.getGender());
		articleDetailRepositroy.save(aa);
		model.addAttribute("article_details", articleDetailRepositroy.findAll());
		return "article_detail_list";
	}
}
