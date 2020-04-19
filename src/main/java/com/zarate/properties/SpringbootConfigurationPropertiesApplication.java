package com.zarate.properties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zarate.properties.app.PisonianConspiracyProperties;

@SpringBootApplication
public class SpringbootConfigurationPropertiesApplication {

	@Autowired
	private PisonianConspiracyProperties properties;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigurationPropertiesApplication.class, args);
	}

	@PostConstruct
	public void test() {
		System.out.println("Use a breakpoint here to inspect the variable.");
		System.out.println(properties.getCommitSuicide());
		System.out.println(properties.getExiled());
		System.out.println(properties.getExecuted());
		System.out.println(properties.getPardoned());
	}

}
