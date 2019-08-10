package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String pessel;
    private String jobTitle;

    @Embedded
    private User user;
    @OneToMany(mappedBy = "users") //?jeden do jednego?
    private List<User> userList;

    @Embedded
    private Car car;
    @ManyToMany (mappedBy = "cars")   //jeden kierowca do wilu aut
    private List<Car> carList;

}
