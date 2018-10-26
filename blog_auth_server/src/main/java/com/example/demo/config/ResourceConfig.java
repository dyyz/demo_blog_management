package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
@Order(value = Ordered.HIGHEST_PRECEDENCE) // 将过滤器提升到 SpringSecurity 的过滤器之前，
										   // 否则，/user/**会被拦截，不被 OAuth2 过滤器链处理。
public class ResourceConfig extends ResourceServerConfigurerAdapter {
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/user/**").authorizeRequests().anyRequest().authenticated();
	}
}
