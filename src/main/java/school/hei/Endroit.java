package school.hei;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@EqualsAndHashCode

public class Endroit {

    private String nom;

    private double longitude;

    private double latitude;

    private String description;
}
