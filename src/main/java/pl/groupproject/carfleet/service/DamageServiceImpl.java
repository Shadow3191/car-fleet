package pl.groupproject.carfleet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.model.Damage;
import pl.groupproject.carfleet.repository.DamageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DamageServiceImpl implements DamageService {

    private DamageRepository damageRepository;


    @Override
    public List<Damage> getAll() {
        return damageRepository.findAll();
    }

    @Override
    public void addDamages(Damage carsDamage) {
        damageRepository.save(carsDamage);
    }
}
