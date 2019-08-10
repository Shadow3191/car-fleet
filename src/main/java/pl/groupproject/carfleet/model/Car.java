package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private int amountOfFuel;

    @ManyToMany(mappedBy = "cars")
    private List<Driver> driverList;

    @ManyToMany
    @JoinTable(
            name = "damage_cars",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "damage_id"))
    private List<Damage> damageList;

    @OneToMany(mappedBy = "departures")
    private List<Departure> departureList;
}