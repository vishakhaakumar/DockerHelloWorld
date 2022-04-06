package com.example.DockerHelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerHelloWorldApplication {

	public static void main(String[] args) {
				SpringApplication.run(DockerHelloWorldApplication.class, args);
				System.out.println("Sample application to test docker - Hello World");
	}
}
