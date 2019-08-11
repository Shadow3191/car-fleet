package pl.groupproject.carfleet;


import org.apache.catalina.LifecycleException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
public class CarFleetApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CarFleetApplication.class);
    }
    public static void main(String[] args) throws LifecycleException {
        SpringApplication.run(CarFleetApplication.class, args);

    }

}