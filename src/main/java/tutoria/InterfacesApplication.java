package tutoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"tutoria.modelo"})
public class InterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacesApplication.class, args);
	}

}
