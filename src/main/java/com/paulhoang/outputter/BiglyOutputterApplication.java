package com.paulhoang.outputter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BiglyOutputterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiglyOutputterApplication.class, args);
	}

}
