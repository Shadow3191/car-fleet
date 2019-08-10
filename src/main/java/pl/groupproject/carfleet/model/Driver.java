package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

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
    @ManyToMany (mappedBy = "cars")   //jeden kierowca do wilu aut
    private List<Car> carList;

}
