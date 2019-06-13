package ocpp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("ocpp.repo")
@SpringBootApplication
public class OcppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcppApplication.class, args);
	}
}
