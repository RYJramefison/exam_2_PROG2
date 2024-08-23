package school.hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

@ToString
@EqualsAndHashCode
@Getter
@AllArgsConstructor

public class Carte {

    private String nom;

    private List<Parc> plusieursParc;

    public void getAllReviews(){
        for (Parc parc : plusieursParc) {
            for (Hotel hotel : parc.getDesHotels()) {
                System.out.println(hotel.getNom()+": "+hotel.getAvisDesClients());
            }
        }
    }

    public void getAllPlacesInside(double latitudeMaximal,double latitudeMinimal,double longitudeMinimale,double longitudeMaximal){
        List<Endroit> listeDesEndroits = new ArrayList<>();

        for (Parc parc : plusieursParc) {
            if (parc.getLatitude() <= latitudeMinimal && parc.getLatitude() >= latitudeMaximal &&
                    parc.getLongitude() <= longitudeMinimale && parc.getLongitude() >= longitudeMinimale){
                listeDesEndroits.add(parc);
            }
        }

        for (Parc parc : plusieursParc) {
            for (Hotel hotel : parc.getDesHotels()) {
                if (hotel.getLatitude() <= latitudeMinimal && hotel.getLatitude() >= latitudeMaximal &&
                        hotel.getLongitude() <= longitudeMinimale && hotel.getLongitude() >= longitudeMinimale){
                    listeDesEndroits.add(hotel);
                }
            }
        }
    }
}
