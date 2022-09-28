package com.expenser;

import com.expenser.example.ExampleClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServiceApplication {

	public static void main(String[] args) {
		ExampleClass exampleClass = new ExampleClass();
		exampleClass.testPrint();
		SpringApplication.run(WebServiceApplication.class, args);
	}

}
