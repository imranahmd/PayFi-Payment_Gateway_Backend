package com.payfi.transaction.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Order(2)
public class CorsConfiguration implements WebMvcConfigurer {
	
	@Value("${client.origin.port}")
	private String clientOrigin;
	
	 @Override
	 public void addCorsMappings(CorsRegistry registry) {
		    registry.addMapping("/**") // Apply CORS configuration to all endpoints
		        .allowedOrigins(clientOrigin) // Whitelist the allowed origin (replace with your React app's URL)
		        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
		        .allowedHeaders("Authorization", "Content-Type", "Access-Control-Allow-Origin") // Allowed headers
		        .allowCredentials(true) // Allow sending credentials such as cookies
		        .maxAge(3600); // Cache preflight requests for 3600 seconds (1 hour)
		}
	 
}
