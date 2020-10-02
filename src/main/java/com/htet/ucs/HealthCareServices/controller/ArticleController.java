package com.htet.ucs.HealthCareServices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.htet.ucs.HealthCareServices.dto.ArticleDTO;
import com.htet.ucs.HealthCareServices.services.ArticleInterface;


@Controller
public class ArticleController{
	@Autowired
	private ArticleInterface articleInterface;
	
//	@GetMapping("/")
//	public String index(Model model) {
//		return "index";
//	}
	
	
	//************ARTICLE*************
	
	@GetMapping("admin/create_article")
	public String createArticel(Model model) {
		model.addAttribute("article", new ArticleDTO());
		return "adminArticle";
	}
	@PostMapping("admin/create_article")
	public String saveArticle(@ModelAttribute("article") ArticleDTO a,Model model) {		
		articleInterface.saveArtical(a);	
		return "redirect:/admin/article_list";
	}
	@GetMapping("admin/article_list")
	public String articleList(Model model) {
		model.addAttribute("articleList", articleInterface.getAllArticleList());
		return "adminArticleList";
	}
	
	//FOR EDIT AND DELETE CITY
	
		@GetMapping("admin/edit_article/{id}")
		public String edit(@PathVariable Long id,Model model) {
			if(id==null) {
				
			}
			ArticleDTO dto=articleInterface.findById(id);
			model.addAttribute("article", dto);
			return "adminArticleEdit";
		}
		@PostMapping("admin/edit_article")
		public String editArticle(@ModelAttribute(value="article") ArticleDTO dto,Model model) {
			articleInterface.saveArtical(dto);
			return "redirect:/admin/article_list";
		}
		@GetMapping("admin/delete_article/{id}")
		public String delete(@PathVariable Long id) {
			articleInterface.delete(id);
			return "redirect:/admin/article_list";
		}
	
}
