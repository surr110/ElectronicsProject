package com.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityClass extends WebSecurityConfigurerAdapter {
//	public void configure(AuthenticationManagerBuilder aut) throws Exception {
//
//		aut.inMemoryAuthentication()
//
//				.withUser("Ajith").password("$2a$10$fhZSrhuegDLo.ESum8c4gu0KLyeXSOkQPk.Lgm04btfIcJq/Tt8MG")
//
//				.roles("Manager").and().withUser("Vijay")
//
//				.password("$2a$10$fhZSrhuegDLo.ESum8c4gu0KLyeXSOkQPk.Lgm04btfIcJq/Tt8MG").roles("Trainer").and()
//
//				.withUser("Rajini").password("$$2a$10$fhZSrhuegDLo.ESum8c4gu0KLyeXSOkQPk.Lgm04btfIcJq/Tt8MG")
//
//				.roles("student");
//
//	}
//
//	public void configure(HttpSecurity http) throws Exception {
//
//		http.authorizeHttpRequests().antMatchers("/manager").hasRole("Manager");
//
//		http.authorizeHttpRequests().antMatchers("/student").permitAll();
//
//		http.authorizeHttpRequests().antMatchers("/trainer").hasAnyRole("Manager", "Trainer").and().formLogin();
//
//	}
//
//	@Bean
//	PasswordEncoder getByCryptedPass() {
//		return new BCryptPasswordEncoder(10);
//	}
//
//     <     ---------------------Authentication--------------------------------------------->
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	
//		auth.inMemoryAuthentication().withUser("Apple").password("$2a$10$swEV6XjTilIwYmQZ3funIuEOIyM.qU3xQbAKpTDkMxIJ6FbxMss6e").roles("Student");
//	}
//	
//	
//	@Bean
//	public PasswordEncoder pass() {
//		return new BCryptPasswordEncoder(10);
//	}

//	@Bean
//	public PasswordEncoder pass() {
//		return NoOpPasswordEncoder.getInstance();
//	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Apple").password("$2a$10$Wqi2BsefJrkSAm3TzvmPVO7aS69nwj4mA0AqM1WI87dW62pWlEi2G").roles("Manager").and().withUser("Banana")
				.password("$2a$10$Y1qnq1a5YUaGfHXN6XltOujnQBm8dlZ/GEJgyX5znpMm/c0guike2").roles("Trainer").and().withUser("Cucumber").password("$2a$10$PpMbab4IuwXFYTn2KcomRerGPnQm7v/y3R8QMFHvoUnlufoxVGgUK").roles("Student");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/getmanager").hasRole("Manager");
		http.authorizeRequests().antMatchers("/gettrainer").hasAnyRole("Manager","Trainer");
		http.authorizeRequests().antMatchers("/getstudent").permitAll().and().formLogin();
		
	}
	@Bean
	public PasswordEncoder pass() {
		return new BCryptPasswordEncoder(10);
	}
	

}
