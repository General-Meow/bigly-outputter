package com.paulhoang.biglypersister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BiglyPersisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiglyPersisterApplication.class, args);
	}

}
