package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//@Embeddable
@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String carModel;
    private String initialMileage;
    private String finaleMileage;
    private String vinNr;
    private int amountOfFuel;

    @ManyToMany(mappedBy = "cars")
    private List<Driver> drivers;


    @ManyToMany //c**
    @JoinTable(
            name = "damages_cars",
            joinColumns = @JoinColumn(name = "car_id"),
            inverseJoinColumns = @JoinColumn(name = "damage_id"))
    private List<Damage> damages;


    //    @OneToMany(mappedBy = "cars")
//    private List<Departure> departures;
    @ManyToOne
    @JoinColumn(name = "departures_id")
    private Departure departures;
}