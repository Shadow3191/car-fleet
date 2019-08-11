package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table (name = "damages")
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private DamageType damageType;
    private String description;
    @Column(name = "can_be_used_t/f")
    private boolean drivable;


    @ManyToMany(mappedBy = "damages")
    private Set<Departure> departures;

    @ManyToMany(mappedBy = "damages")
    private List<Car> cars;


//    @ManyToOne
//    @JoinColumn(name = "drivers_id")
//    private Driver driver;

    @OneToMany(mappedBy = "damages")
    private Set<Driver> drivers;

}
