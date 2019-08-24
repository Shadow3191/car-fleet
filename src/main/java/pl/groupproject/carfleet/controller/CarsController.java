package pl.groupproject.carfleet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import pl.groupproject.carfleet.model.Car;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.service.CarService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarsController {

    private final CarService service;

    @GetMapping("/cars")
    public String allCars(Model model) {
        List<Car> cars = service.getAll();
        model.addAttribute("carslist", cars);
        return "cars";
    }

    @GetMapping("/addcar")
    public String addCar(Model model) {
        model.addAttribute("carsForm", new Car());
        return "addcar";
    }

    @PostMapping("/addcar")
    public String registration(@ModelAttribute("carForm") Car carForm, BindingResult bindingResult) {
        service.addCar(carForm);

        return "redirect:/cars";
    }

//    @PutMapping("/updatecar")
//    public String registration(@ModelAttribute("carForm")Car carForm, BindingResult bindingResult){
//        service.
//    }
}
