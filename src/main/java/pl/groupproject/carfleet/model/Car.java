package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String mark;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private String amoundOfFuel;
    private boolean damaged;


}
