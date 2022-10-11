package com.jbk.supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SupplierManagement_RestAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupplierManagement_RestAPIApplication.class, args);
	}

}
