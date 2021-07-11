package com.cts.mfpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class signApplication {

	public static void main(String[] args) {
		SpringApplication.run(signApplication.class, args);
	}
	
	@Bean
	public RestTemplate rest()
	{
		return new RestTemplate();
		
	}

}
