package pl.groupproject.carfleet.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String login;
    private String password;
    private String email;
}
