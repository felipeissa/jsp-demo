package com.example.jsp_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {" com.example.jsp_demo"})
public class JspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JspDemoApplication.class, args);
	}
}
