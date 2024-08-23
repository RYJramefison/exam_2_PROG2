package school.hei;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode
@Getter
@ToString

public class Hotel extends Endroit {

    private String contact;

    private List<Avis> avisDesClients;

    private List<Chambre> listDesChambres;

    public Hotel(String nom, double longitude, double latitude, String description, String contact, List<Avis> avisDesClients, List<Chambre> listDesChambres) {
        super(nom, longitude, latitude, description);
        this.contact = contact;
        this.avisDesClients = avisDesClients;
        this.listDesChambres = listDesChambres;
    }

    public void addReview(Avis avis){
        avisDesClients.add(avis);
    }




}
