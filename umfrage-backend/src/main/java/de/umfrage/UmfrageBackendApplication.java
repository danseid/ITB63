package de.umfrage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UmfrageBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmfrageBackendApplication.class, args);
	}
}
