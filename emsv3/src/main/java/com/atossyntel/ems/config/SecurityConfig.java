package com.atossyntel.ems.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	public SecurityConfig() {
	System.out.println("SecurityConfig  created...");
	}
	
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("authentication..............");

		auth.inMemoryAuthentication()
		     .withUser("ram").password("ram").roles("ADMIN").and()
		     .withUser("rahim").password("rahim").roles("USER").and()
			 .withUser("david").password("david").roles("USER");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		System.out.println("authorization..............");

		http.authorizeRequests()
				.antMatchers("/hello").hasRole("ADMIN")
				.antMatchers("/welcome/today").hasRole("USER")
				.anyRequest()
				//.permitAll()
				.fullyAuthenticated()
				.and().formLogin();
				//.httpBasic();
     	       
		
		
		http.csrf().disable();

	}

	
	
	
	
	
	
}
