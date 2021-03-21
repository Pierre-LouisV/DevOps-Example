package com.devops.devOpsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DevOpsDemoApplication {

		public static void main(String[] args) {
			ApplicationContext ctx = SpringApplication.run(DevOpsDemoApplication.class, args);

			System.out.println("Started application.");
		}


}
