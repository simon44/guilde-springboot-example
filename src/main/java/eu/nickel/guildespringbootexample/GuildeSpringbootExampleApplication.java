package eu.nickel.guildespringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GuildeSpringbootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuildeSpringbootExampleApplication.class, args);
	}
}
