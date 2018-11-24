package br.com.fiap.shift.microservice.msproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsproducerApplication.class, args);
	}
}
