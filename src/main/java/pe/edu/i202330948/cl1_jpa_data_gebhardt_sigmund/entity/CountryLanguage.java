package pe.edu.i202330948.cl1_jpa_data_gebhardt_sigmund.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryLanguage {

    @Id
    private String language;

    private String isOfficial;

    private Double percentage;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "CountryCode")
    private Country country;

}
