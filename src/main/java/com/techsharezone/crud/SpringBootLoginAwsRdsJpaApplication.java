package com.techsharezone.crud;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootLoginAwsRdsJpaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootLoginAwsRdsJpaApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.headless(Boolean.TRUE)
				.run(args);
	}

}
