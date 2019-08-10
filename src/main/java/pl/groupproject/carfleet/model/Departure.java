package pl.groupproject.carfleet.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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
}
