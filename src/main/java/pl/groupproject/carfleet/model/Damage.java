package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private DamageType damageType;
    private String description;
    @Column(name = "can_be_used_t/f")
    private boolean drivable;


    @ManyToMany(mappedBy = "damages")
    private List<Departure> departureList;

    @ManyToMany(mappedBy = "damages")
    private List<Car> carList;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private List<Driver> driverList;

}
