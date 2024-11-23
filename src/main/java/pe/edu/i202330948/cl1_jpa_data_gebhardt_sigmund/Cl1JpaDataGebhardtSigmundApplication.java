package pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.repository.CountryRepository;



@SpringBootApplication
public class Cl1JpaDataGebhardtSigmundApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {

		SpringApplication.run(Cl1JpaDataGebhardtSigmundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
