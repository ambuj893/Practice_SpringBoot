package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.apple.eawt.Application;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DemoApplication.class, args); // Creates the IOC/Spring container
		Dev obj=context.getBean(Dev.class); // Spring creates the object
		obj.build();
	}

}
