package com.payfi.admin.config;

import org.modelmapper.ModelMapper;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AdminConfig {
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
