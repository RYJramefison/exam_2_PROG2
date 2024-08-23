package school.hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class Avis {

    private Personne personne;

    private String nameParcOuHotelOuNumeroChambre;

    private int score;

    private String commentaire;

    private LocalDate date;

    @Override
    public String toString() {
        return "Avis {" +
                "personne: " + personne +
                ", nameParcOuHotelOuNumeroChambre: '" + nameParcOuHotelOuNumeroChambre + '\'' +
                ", score: " + score +"sur 5"+
                ", commentaire: '" + commentaire + '\'' +
                ", date= " + date +
                '}';
    }
}
