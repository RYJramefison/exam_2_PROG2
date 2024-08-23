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


    public double findCheapesHotelPrice(List<Parc> listeDesParc){
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
        double totalTarif = 0;

        for (Chambre chambre : lesChambresASejourner) {
            totalTarif += chambre.getTarif();
        }
        
        return totalTarif;
    }

    public String getAllReviewedItems(Carte carte){
        List<Endroit> lesHotelEtLesParc = new ArrayList<>();
        List<Chambre> lesChambre = new ArrayList<>();
        for (Parc parc : carte.getPlusieursParc()) {
            for (Hotel hotel : parc.getDesHotels()) {
                for (Avis avisDesClient : hotel.getAvisDesClients()) {
                    if (avisDesClient.getNameParcOuHotelOuNumeroChambre().equals(parc.getNom())) {
                        if (lesHotelEtLesParc.contains(parc)) {
                            System.out.println("il existe deja");
                        }
                        else {
                            lesHotelEtLesParc.add(parc);
                        }
                    }
                    if (avisDesClient.getNameParcOuHotelOuNumeroChambre().equals(hotel.getNom())) {
                        if (lesHotelEtLesParc.contains(hotel)) {
                            System.out.println("il existe deja");
                        }
                        else {
                            lesHotelEtLesParc.add(hotel);
                        }
                    }
                    for (Chambre chambre : hotel.getListDesChambres()) {
                        if (avisDesClient.getNameParcOuHotelOuNumeroChambre().equals(chambre.getNumero())) {
                            if (lesChambre.contains(chambre)) {
                                System.out.println("il existe deja");
                            }
                            else {
                                lesChambre.add(chambre);
                            }
                        }
                    }
                }

            }
        }

        return lesHotelEtLesParc+" "+lesChambre;
    }
}
