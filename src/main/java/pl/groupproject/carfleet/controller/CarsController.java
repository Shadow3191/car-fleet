package pl.groupproject.carfleet.controller;

import com.sun.xml.fastinfoset.util.CharArrayIntMap;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pl.groupproject.carfleet.dto.CarInformationDto;
import pl.groupproject.carfleet.dto.CarsDto;
import pl.groupproject.carfleet.model.Car;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.service.CarService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CarsController {

    private final CarService service;

    @GetMapping("/cars")
    public String allCars(Model model) {
        List<CarsDto> cars = service.getAll();
        model.addAttribute("carslist", cars);
        return "cars";
    }

    @GetMapping("/addcar")
    ModelAndView createAddCarView() {
        ModelAndView modelAndView = new ModelAndView("addcar");
        modelAndView.addObject("car", new CarInformationDto());
        return modelAndView;
    }

    @PostMapping("/addcar")
    public String registration(@ModelAttribute("car") CarInformationDto carForm, BindingResult bindingResult) {
        service.addCar(carForm);

        return "redirect:/cars";
    }

    @PostMapping("/cars")
    public String reservation(HttpServletRequest request){
        String parameter = request.getParameter("msg");
        service.makeReservation(parameter);
        System.out.println(parameter);

        return "redirect:/cars";
    }



}

