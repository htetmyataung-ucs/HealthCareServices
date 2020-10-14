package com.htet.ucs.HealthCareServices.services;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htet.ucs.HealthCareServices.dto.ArticleDetailDTO;
import com.htet.ucs.HealthCareServices.model.ArticleDetail;
import com.htet.ucs.HealthCareServices.repository.ArticleDetailRepository;
import com.htet.ucs.HealthCareServices.service.mapper.ArticleDetailConverter;

@Service
public class ArticleDetailService implements ArticleDetailInterface {
	@Autowired
	private ArticleDetailRepository articleDetailRepository;
	@Autowired
	ServletContext servletContext;
	public String UPLOAD_DIRECTORY = "/images/";

	@Override
	public void saveArticlDetail(ArticleDetailDTO articleDTO) {
		// TODO Auto-generated method stub
		if (articleDTO != null) {
			ArticleDetail ad = new ArticleDetail();
			String path = servletContext.getRealPath(UPLOAD_DIRECTORY);
			String filename = articleDTO.getFile().getOriginalFilename();
			System.out.println(path + " " + filename);

			try {
				byte[] bytes = articleDTO.getFile().getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(new File(path + File.separator + filename)));
				stream.write(bytes);
				stream.flush();
				stream.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			if (articleDTO.getId() != null) {
				ad.setId(articleDTO.getId());
			}
			ad.setPhoto(filename);
			ad.setName(articleDTO.getName());
			ad.setDescription(articleDTO.getDescription());
			ad.setGender(articleDTO.getGender());
			ad.getArticle().setId(articleDTO.getArticleId());
			articleDetailRepository.save(ad);
		}
		// articleDetailRepository.save(ArticleDetailConverter.convertToEntity(articleDTO));
	}

	@Override
	public List<ArticleDetailDTO> getAllArticleDetailList() {
		// TODO Auto-generated method stub
		return articleDetailRepository.findAll().stream().map(ArticleDetailConverter::convertToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public ArticleDetailDTO findById(Long id) {
		// TODO Auto-generated method stub
		ArticleDetailDTO dto = ArticleDetailConverter.convertToDTO(articleDetailRepository.findById(id).get());
		return dto;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		articleDetailRepository.deleteById(id);
	}

	@Override
	public List<ArticleDetailDTO> findDetailsByArticleName(String name) {
		// TODO Auto-generated method stub
		return articleDetailRepository.findDetailByArticleName(name).stream().map(ArticleDetailConverter::convertToDTO)
				.collect(Collectors.toList());
	}

}
