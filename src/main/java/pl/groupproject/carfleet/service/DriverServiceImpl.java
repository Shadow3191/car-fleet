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

    //@Autowired
    private DriverRepository driverRepository;
    //@Autowired
    private RoleRepository roleRepository;
    //@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

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

    public void setDriverRepository(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public BCryptPasswordEncoder getbCryptPasswordEncoder() {
        return bCryptPasswordEncoder;
    }
}
