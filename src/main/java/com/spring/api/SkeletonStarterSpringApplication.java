package com.spring.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.controller.MainController;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class SkeletonStarterSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkeletonStarterSpringApplication.class, args);
	}
}
