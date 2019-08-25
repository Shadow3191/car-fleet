package pl.groupproject.carfleet.model;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import pl.groupproject.carfleet.service.CarService;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table (name = "damages")
@EntityListeners(AuditingEntityListener.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Damage {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private DamageType damageType;
    private String description;
    @Column(name = "can_be_used")
    private boolean drivable;
   // private List<Car> carModel; //todo lista wyboru samochodu z bazy findCarByID


    @ManyToMany(mappedBy = "damages")
    private Set<Departure> departures;

    @ManyToMany(mappedBy = "damages")
    private List<Car> cars;

//    @ManyToOne
//    @JoinColumn(name = "drivers_id")
//    private Driver driver;

    @OneToMany(mappedBy = "damages")
    private Set<Driver> drivers;


    public boolean getDrivable() {
        return drivable;
    }



}
