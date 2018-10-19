package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
//@EnableZuulServer
@EnableZuulProxy
@EnableDiscoveryClient
//@EnableOAuth2Sso
@EnableOAuth2Client
public class BlogZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogZuulApplication.class, args);
	}
}
