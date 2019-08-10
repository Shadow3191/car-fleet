package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private int amountOfFuel;

    @ManyToOne
    private List<Damage> damageList;

}