package gr.upatras.rest.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
//		server.port = 8081;
		SpringApplication.run(Application.class, args);
	}
}