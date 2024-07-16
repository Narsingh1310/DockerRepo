package com.example.springmvcdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMVCConfig {
	
	
	@Bean
	public  InternalResourceViewResolver initresolver() {
		InternalResourceViewResolver ir =  new InternalResourceViewResolver();
		ir.setPrefix("/");
		ir.setSuffix(".html");
      return ir ;
	}
	
	
}
