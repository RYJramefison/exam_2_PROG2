package school.hei;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode

public class Parc extends Endroit{

    private List<Hotel> desHotels;

    public Parc(String nom, double longitude, double latitude, String description) {
        super(nom, longitude, latitude, description);
    }


}
