package pl.groupproject.carfleet.service;

import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.dto.DamageDto;
import pl.groupproject.carfleet.model.Damage;

import java.util.List;


public interface DamageService {

    List<Damage> getAll();

    void addDamages(DamageDto carsDamage);

    void save(Damage damageList);


    //dodawanie, usuwanie, lista, wyszukiwanie, usuwanie jednego po id_car czy damage, usuwanie wszystkich
}
