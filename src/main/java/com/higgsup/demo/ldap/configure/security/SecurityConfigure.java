package com.higgsup.demo.ldap.configure.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {
	
	@Value("${user.dn.pattern}")
	private String userDnPattern;
	
	@Value("${group.filter}")
	private String groupFilter;
	
	@Value("${group.base}")
	private String groupBase;
	
	@Value("${ldif.path}")	
	private String ldifPath;
	
	@Value("${spring.ldap.embedded.base-dn}")
	private String baseDN;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers(HttpMethod.POST, "/api/login").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
			.and()
			.httpBasic()
			.and()
			.addFilterBefore(new JWTLoginFilter("/api/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
			.addFilterBefore(new JWTAuthenticateFilter(),  UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.ldapAuthentication()
		.userDnPatterns(userDnPattern)
		.groupSearchBase(groupBase)
		.groupSearchFilter(groupFilter)
		.contextSource()
			.root(baseDN).ldif(ldifPath)
			.and()
		.passwordCompare().passwordAttribute("userPassword");
	}
		
}
