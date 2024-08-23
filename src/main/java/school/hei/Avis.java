package school.hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Avis {

    private Personne personne;

    private String nameParcOuHotelOuNumeroChambre;

    private int note;

    private String commentaire;
}
