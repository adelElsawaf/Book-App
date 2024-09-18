package com.example.bookapp;

import static com.example.bookapp.shared.Constants.logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
		logger.info("The Book App Service Application has Started");

	}

}
