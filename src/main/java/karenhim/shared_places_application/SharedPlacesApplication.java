package karenhim.shared_places_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@SpringBootApplication
public class SharedPlacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharedPlacesApplication.class, args);
	}

}
