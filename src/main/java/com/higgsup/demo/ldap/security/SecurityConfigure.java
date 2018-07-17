package com.higgsup.demo.ldap.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/api/**")
		.hasRole("MANAGERS")
		.anyRequest()
		.authenticated().and().formLogin().and().httpBasic()
		.and().logout().permitAll().and().httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.ldapAuthentication()
		.userDnPatterns("uid={0},ou=people")
		.groupSearchBase("ou=groups")
		.groupSearchFilter("member={0}")
		.contextSource()
			.root("dc=habuma,dc=com").ldif("classpath:test-server.ldif")
			.and()
		.passwordCompare().passwordAttribute("userPassword");
	}
	
}
