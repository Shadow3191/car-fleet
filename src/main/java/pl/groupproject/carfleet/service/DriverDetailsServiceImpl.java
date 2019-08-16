package pl.groupproject.carfleet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.model.Role;
import pl.groupproject.carfleet.repository.DriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverDetailsServiceImpl implements DriverDetailsService {


    @Autowired
    private DriverRepository driverRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadDriverByLogin(String login) throws UsernameNotFoundException {
        Driver driver = driverRepository.findByLogin(login);

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        for (Role role : driver.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        return new org.springframework.security.core.userdetails
                .User(driver.getFirstName(), driver.getPassword(), grantedAuthorities);
        //.User(user.getUsername(), user.getPassword(), grantedAuthorities);

    }
}
