package pl.groupproject.carfleet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.repository.DriverRepository;
import pl.groupproject.carfleet.repository.RoleRepository;

import java.util.HashSet;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private final DriverRepository driverRepository;
    //@Autowired
    private final RoleRepository roleRepository;
    //@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public DriverServiceImpl(DriverRepository driverRepository, RoleRepository roleRepository) {
        this.driverRepository = driverRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Driver driver) {
        driver.setPassword(driver.getPassword());
        driver.setRoles(new HashSet<>(roleRepository.findAll()));
        driverRepository.save(driver);
    }

    @Override
    public Driver findByLogin(String login) {
        return driverRepository.findByLogin(login);
    }


    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public BCryptPasswordEncoder getbCryptPasswordEncoder() {
        return bCryptPasswordEncoder;
    }
}
