package com.atossyntel.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

public SwaggerConfig() {
System.out.println("Swagger Config created...");
}	
	
@Bean
public Docket emsRestApi() {
	System.out.println("Generating API for Ems..........");
	
   return new Docket(DocumentationType.SWAGGER_2).select()
      .apis(RequestHandlerSelectors.basePackage("com.atossyntel.ems.rest.controller")).build();
}



	
	
}
