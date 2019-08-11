package pl.groupproject.carfleet.service;

import pl.groupproject.carfleet.model.Driver;

public interface DriverService {

    void save(Driver driver);

    Driver findByLogin(String login);
}