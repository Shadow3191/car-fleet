package pl.groupproject.carfleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.groupproject.carfleet.model.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    void findByLogin(String login);
}