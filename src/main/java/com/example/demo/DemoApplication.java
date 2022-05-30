package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private PeopleRepository peopleRepository;

	@Override
	public void run(String... args) throws Exception{
		this.peopleRepository.findAll().stream().forEach(e -> System.out.println(e));
		System.out.println(String.format("Total de gente %d", peopleRepository.count()));
	}

}
