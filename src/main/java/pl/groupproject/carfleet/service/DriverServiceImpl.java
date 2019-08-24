package pl.groupproject.carfleet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.repository.DriverRepository;
import pl.groupproject.carfleet.repository.RoleRepository;

import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepository driverRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Driver driver) {
        driver.setPassword(bCryptPasswordEncoder.encode(driver.getPassword()));
        driver.setRoles(new HashSet<>(roleRepository.findAll()));
        driverRepository.save(driver);
    }

    @Override
    public Driver findByLogin(String login) {
        return driverRepository.findByLogin(login);
    }

}
