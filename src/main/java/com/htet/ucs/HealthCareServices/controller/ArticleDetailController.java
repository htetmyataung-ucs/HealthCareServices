package com.htet.ucs.HealthCareServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.services.ArticleDetailInterface;
import com.htet.ucs.HealthCareServices.services.ArticleInterface;

@Controller
public class ArticleDetailController {
	@Autowired
	private ArticleInterface articleInterface;
	@Autowired
	private ArticleDetailInterface articleDetailInterface;

	// ***********ARTICLE DETAIL*************

	@GetMapping("admin/create_article_detail")
	public String createArticelDetail(Model model) {
		model.addAttribute("articleList", articleInterface.getAllArticleList());
		model.addAttribute("article_detail", new ArticleDetailDTO());
		return "adminArticleDetail";
	}

	@PostMapping("admin/create_article_detail")
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
		return "redirect:/admin/articledetail_list";
	}

	@GetMapping("admin/articledetail_list")
	public String articleDetailList(Model model) {
		model.addAttribute("articleDetailList", articleDetailInterface.getAllArticleDetailList());
		return "adminArticleDetailList";
	}

	// FOR EDIT AND DELETE CITY

	@GetMapping("admin/edit_articleDetail/{id}")
	public String edit(@PathVariable Long id, Model model) {
		if (id == null) {

		}
		ArticleDetailDTO dto = articleDetailInterface.findById(id);
		model.addAttribute("articleDetail", dto);
		model.addAttribute("articleList", articleInterface.getAllArticleList());
		return "adminArticleDetailEdit";
	}

	@PostMapping("admin/edit_articleDetail")
	public String editCity(@ModelAttribute(value = "articleDetail") ArticleDetailDTO dto, Model model) {
		articleDetailInterface.saveArticlDetail(dto);
		return "redirect:/admin/articledetail_list";
	}

	@GetMapping("admin/delete_articleDetail/{id}")
	public String delete(@PathVariable Long id) {
		articleDetailInterface.delete(id);
		return "redirect:/admin/articledetail_list";
	}

	// FOR FIRST AID
	// to get details by article name
	@GetMapping("/findDetailsByArticleName/{name}")
	public @ResponseBody List<ArticleDetailDTO> findDetailsByArticleName(@PathVariable(value = "name") String name) {
		return articleDetailInterface.findDetailsByArticleName(name);
	}

	// FOR FIRST AID
	@GetMapping("/firstAid")
	public String firstAid(Model model) {
		String name = "FirstAid";
		model.addAttribute("firstAidList", articleDetailInterface.findDetailsByArticleName(name));
		return "firstAid";
	}

	// FOR DISEASE
	@GetMapping("/disease")
	public String disease(Model model) {
		String name = "Disease";
		model.addAttribute("diseaseList", articleDetailInterface.findDetailsByArticleName(name));
		return "disease";
	}
	//FOR KNOWLEDGE
	@GetMapping("/knowledge")
	public String knowledge(Model model) {
		String name="Knowledge";
		model.addAttribute("knowledgeList",articleDetailInterface.findDetailsByArticleName(name));
		return "knowledge";
	}
	@GetMapping("/articleDetailInfo/{id}")
	public String articleDetailInfo(@PathVariable Long id, Model model) {
		model.addAttribute("detailInfo",articleDetailInterface.findById(id));
		return "articleDetailInfo";
	}
	

}
