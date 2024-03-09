package com.onewill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceBoilerplateProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBoilerplateProjectApplication.class, args);
	}

}
