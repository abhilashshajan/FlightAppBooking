package com.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightAppBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppBookingApplication.class, args);
	}

}
