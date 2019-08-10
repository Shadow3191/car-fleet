package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private Long id;
    private String mark;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private String amountOfFuel;
    private boolean damaged;

}