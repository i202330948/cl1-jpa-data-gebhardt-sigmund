package pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.entity.Country;

public interface CountryRepository  extends CrudRepository<Country, String> {
}
