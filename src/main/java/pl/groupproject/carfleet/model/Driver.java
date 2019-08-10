package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table(name = "drivers")
@Entity
public class Driver {

    @Id
    @GeneratedValue
    private Long id;
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String pesel;
    private String jobTitle;


    @Embedded
    private Car car;
    @ManyToMany
    @JoinTable(
            name = "drivers_car",
            joinColumns = @JoinColumn(name = "driver_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    private List<Car> carList;

    @OneToMany(mappedBy = "departures")
    private List<Departure> departureList;

    @OneToMany(mappedBy = "damages")
    private List<Damage> damageList;
}