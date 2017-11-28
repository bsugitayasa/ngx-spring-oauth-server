package com.balicamp.ngx.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class NgxSpringOauthServerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(NgxSpringOauthServerApplication.class, args);
	}
}
