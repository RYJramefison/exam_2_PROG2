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

    private List<Parc> plusieursParc;

    public void getAllReviews(){
        for (Parc parc : plusieursParc) {
            for (Hotel hotel : parc.getDesHotels()) {
                System.out.println(hotel.getNom()+": "+hotel.getAvisDesClients());
            }
        }
    }

    public List<Hotel> findBestHotel(){
        Map<Hotel, Integer> meilleurHotel = new HashMap<>();

        for (Parc parc : plusieursParc) {
            for (Hotel hotel : parc.getDesHotels()) {
                meilleurHotel.merge(hotel, 1, Integer::sum);
            }
        }

        List<Hotel> Top1Hotel = meilleurHotel.entrySet().stream().sorted((Comparator<? super Map.Entry<Hotel, Integer>>) Map.Entry.comparingByValue().reversed())
                .limit(1)
                .map(Map.Entry::getKey)
                .toList();

        Hotel top1 = null;
        for (Hotel hotel : Top1Hotel) {
            top1 = hotel;
        }

        return (List<Hotel>) top1;
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
