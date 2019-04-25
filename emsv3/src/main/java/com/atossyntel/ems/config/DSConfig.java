package com.atossyntel.ems.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class DSConfig {

public DSConfig() {
System.out.println("DSConfig created....");
}	
	

@Bean
public ServletRegistrationBean spring() {
    
	System.out.println("#########Spring DS created#########");

DispatcherServlet dispatcherServlet = new DispatcherServlet(); 

 AnnotationConfigWebApplicationContext applicationContext = 
		  new AnnotationConfigWebApplicationContext();
    
    dispatcherServlet.setApplicationContext(applicationContext);
    
    ServletRegistrationBean servletRegistrationBean = new 
    		ServletRegistrationBean(dispatcherServlet, "/spring/*");
    
    servletRegistrationBean.setName("spring");
    
    return servletRegistrationBean;
}


@Bean
public ServletRegistrationBean rest() {
	System.out.println("#########Rest DS created ###########");
   	
	DispatcherServlet dispatcherServlet = new DispatcherServlet();
    
	AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
    
	dispatcherServlet.setApplicationContext(applicationContext);
    
	ServletRegistrationBean servletRegistrationBean = new 
			ServletRegistrationBean(dispatcherServlet, "/rest/*");
    servletRegistrationBean.setName("rest");
    return servletRegistrationBean;
}





	
	
	
}
