package com.chat.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.chat.app.*")
@ComponentScan(basePackages = "com.chat.app.*")
public class UserChatAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(UserChatAppApplication.class, args);
	}

}
