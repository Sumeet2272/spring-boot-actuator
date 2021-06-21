package com.example.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="custom")
@Component
public class CustomEndPointDemo 
{
	@ReadOperation
    @Bean
    public String greet() {
        return "Hello from custom endpoint";
    }
}
