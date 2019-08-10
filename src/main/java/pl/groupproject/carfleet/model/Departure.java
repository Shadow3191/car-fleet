package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
@Entity
public class Departure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String depFrom;
    private String depTo;
    private int distance;

    @JoinTable(
            name = "departure_damage",
            joinColumns = @JoinColumn(name = "departure_id"),
            inverseJoinColumns = @JoinColumn(name = "damage_id"))
    private List<Departure> departureList;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private List<Driver> driverList;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private List<Car> carList;
}
