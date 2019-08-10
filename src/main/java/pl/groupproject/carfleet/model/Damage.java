package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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


    @OneToMany
    private Car car;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Departure departure;


}
