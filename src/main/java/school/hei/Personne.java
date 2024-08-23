package school.hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString

public class Personne {
    private int nom;

    private String contact;


    public void findCheapesHotelPrice(List<Parc> listeDesParc){
        List<Chambre> lesChambresASejourner = new ArrayList<>();
        for (Parc parc : listeDesParc) {
            for (Hotel hotel : parc.getDesHotels()) {
                Chambre chambreMoinsCher = null;
                for (Chambre chambre : hotel.getListDesChambres()) {
                    if (chambreMoinsCher == null){
                        chambreMoinsCher = chambre;
                    }
                    else if(chambreMoinsCher.getTarif() > chambre.getTarif()){
                        chambreMoinsCher = chambre;
                    }
                    else {
                        chambreMoinsCher = chambreMoinsCher;
                    }
                }
                if (lesChambresASejourner.contains(chambreMoinsCher)){
                    System.out.println("il y a deja cette chambre");
                }
                else {
                    lesChambresASejourner.add(chambreMoinsCher);
                }
            }
        }
    }
}
