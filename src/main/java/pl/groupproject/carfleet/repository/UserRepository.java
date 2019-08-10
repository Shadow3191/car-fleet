package pl.groupproject.carfleet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.groupproject.carfleet.model.User;

public interface UserRepository extends JpaRepository <User, Long> {


}
