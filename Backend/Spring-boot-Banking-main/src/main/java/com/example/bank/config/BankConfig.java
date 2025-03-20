package com.example.bank.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfig {
	
	@Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
	
}
