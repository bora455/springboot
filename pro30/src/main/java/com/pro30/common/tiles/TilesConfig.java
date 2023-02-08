package com.pro30.common.tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.SimpleSpringPreparerFactory;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {	   
	   @Bean
	   public TilesConfigurer tilesConfigurer() {
		   final TilesConfigurer configurer = new TilesConfigurer();
		   configurer.setDefinitions(new String[] {"WEB-INF/tiles/tiles_member.xml"});
		   //configurer.setDefinitions(new String[] 
				   //{"WEB-INF/tiles/tiles_member.xml", "WEB-INF/tiles/tiles_board.xml"});
		   configurer.setCheckRefresh(true);
		   return configurer;
	   }

	   @Bean
	   public TilesViewResolver tilesViewResolver() {
	      final TilesViewResolver resolver = new TilesViewResolver();
	      resolver.setViewClass(TilesView.class);
	      resolver.setOrder(1);
	      return resolver;
	   }
	   
	   @Bean
	   public UrlBasedViewResolver viewResolver() {
	      final UrlBasedViewResolver resolver = new UrlBasedViewResolver();
	      resolver.setViewClass(TilesView.class);
	      resolver.setOrder(1);	      
	      return resolver;
	   }
}