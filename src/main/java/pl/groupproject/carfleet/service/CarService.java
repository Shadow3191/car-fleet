package pl.groupproject.carfleet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.groupproject.carfleet.dto.CarInformationDto;
import pl.groupproject.carfleet.model.Car;
import pl.groupproject.carfleet.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public void addCar(CarInformationDto car){
        Car carEnitity = Car.builder()
                .id(car.getId())
                .carModel((car.getCarModel()))
                .initialMileage(car.getInitialMileage())
                .finaleMileage(car.getFinaleMileage())
                .vinNr(car.getVinNr())
                .amountOfFuel(car.getAmountOfFuel())
                .build();
        carRepository.save(carEnitity);
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }

//    public void updateCar(Car car){
//        cars. // ???
//    }

    // ogarnac sobie zapisywanie
}
