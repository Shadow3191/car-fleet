package pl.groupproject.carfleet.service;

import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.model.Damage;

import java.util.List;


public interface DamageService {

    List<Damage> getAll();

    void addDamages(Damage carsDamage);


    //dodawanie, usuwanie, lista, wyszukiwanie, usuwanie jednego po id_car czy damage, usuwanie wszystkich
}
