 package com.htet.ucs.HealthCareServices.config;
  
  import org.springframework.context.annotation.Bean; 
  import org.springframework.context.annotation.Configuration;
  import org.springframework.web.multipart.commons.CommonsMultipartResolver;
  import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
  import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
  import org.springframework.web.servlet.view.tiles3.TilesConfigurer; 
  import org.springframework.web.servlet.view.tiles3.TilesView;
  import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
  
  @Configuration 
  public class TileConfig {
  
	  //for tiles
  @Bean public TilesConfigurer tilesConfigurer() { final TilesConfigurer
  configurer = new TilesConfigurer(); configurer.setDefinitions(new
  String[]{"WEB-INF/tiles/tiles.xml"}); configurer.setCheckRefresh(true);
  return configurer; }
  
  @Bean public TilesViewResolver tilesViewResolver() { final TilesViewResolver
  resolver = new TilesViewResolver(); resolver.setViewClass(TilesView.class);
  return resolver; 
  } 
  
  //for accept js and css
  @Bean
 	public WebMvcConfigurer addResourceHandlers() {
 		return new WebMvcConfigurer() {
 			@Override
 			public void addResourceHandlers(final ResourceHandlerRegistry registry) {
 			    registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
 			    registry.addResourceHandler("/images/**").addResourceLocations("/images/**","/images/");

 			}        
         };
 	}
  
  //for file upload
  	@Bean
	 public CommonsMultipartResolver commonsMultipartResolver() {
		 CommonsMultipartResolver commonsMultipartResolver=new CommonsMultipartResolver();
		 commonsMultipartResolver.setMaxUploadSize(500000000);
		 commonsMultipartResolver.setMaxInMemorySize(500000000);
		 return commonsMultipartResolver;
	 }
  }
 

