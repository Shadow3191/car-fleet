package pl.groupproject.carfleet.service;

import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.repository.DriverRepository;

public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;

    @Override
    public void save(Driver driver) {
        driver.setPassword(driver.getPassword());
        driverRepository.save(driver);
    }

    @Override
    public Driver findByLogin(String login) {
        return driverRepository.findByLogin(login);
    }
}
