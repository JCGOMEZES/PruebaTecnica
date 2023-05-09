package com.pichincha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.*;

@SpringBootApplication
@EnableConfigurationProperties
public class PichinchaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PichinchaApplication.class, args);
	}
}
