package pl.groupproject.carfleet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//@Embeddable
@Getter
@Setter
@Entity
@Table(name = "cars")
@EntityListeners(AuditingEntityListener.class)
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

    public Car(String carModel, String initialMileage, String finaleMileage, String vinNr) {
        this.carModel = carModel;
        this.initialMileage = initialMileage;
        this.finaleMileage = finaleMileage;
        this.vinNr = vinNr;
    }

    public Car() {

    }
}