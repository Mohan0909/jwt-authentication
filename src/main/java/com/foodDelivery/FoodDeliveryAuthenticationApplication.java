package com.foodDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.foodDelivery.entity")
@EnableJpaRepositories
@ComponentScan("com.foodDelivery")
public class FoodDeliveryAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryAuthenticationApplication.class, args);
	}

}
