package pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.entity.Country;
import pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.repository.CountryRepository;

import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataGebhardtSigmundApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataGebhardtSigmundApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// intentar encontrar el país "ARG" (Argentina)
		Optional<Country> optionalCountry = countryRepository.findById("ARG");

		optionalCountry.ifPresentOrElse(
				country -> {
					// si se encuentra "ARG", imprimir los lenguajes
					System.out.println("Lenguajes en ARG:");
					country.getCountryLanguage().forEach(language -> System.out.println(language.getLanguage()));
				},
				() -> {
					// Si no se encuentra "ARG", intentar con "PER" (Perú)
					Optional<Country> optionalPeru = countryRepository.findById("PER");
					optionalPeru.ifPresentOrElse(
							peru -> {
								// si se encuentra "PER", imprimir los lenguajes
								System.out.println("Lenguajes en PER:");
								peru.getCountryLanguage().forEach(language -> System.out.println(language.getLanguage()));
							},
							() -> {
								// si no se encuentra ni "ARG" ni "PER"
								System.out.println("No se encontró el país 'PER' ni 'ARG'.");
							}
					);
				}
		);

		// IDs de los países que se eliminarán
//		List<String> lista = List.of("COL","ARG");
//		lista.stream().filter((id) -> {
//			return countryRepository.existsById(id);
//		}).collect(Collectors.toList());
//		lista.stream().filter(countryRepository::existsById).collect(Collectors.toList());
//		countryRepository.deleteAllById(lista);

	}

}