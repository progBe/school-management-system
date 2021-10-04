package iitu.kz.schooltestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchoolTestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolTestServiceApplication.class, args);
	}

}
