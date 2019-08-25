package pl.groupproject.carfleet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.groupproject.carfleet.model.Departure;
import pl.groupproject.carfleet.service.DepartureService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DepartureController {


    private final DepartureService service;

    @GetMapping("/departure")
    public String addDeparture(Model model) {
        model.addAttribute("departureForm", new Departure());
        return "/departure";
    }

    @PostMapping("/departure")
    public String addDeparture(@ModelAttribute("departureForm") Departure departure) {

        service.save(departure);
        return "redirect:/departurelist";
    }

    @GetMapping("/departurelist")
    public String allCars(Model model) {
        List<Departure> departures = service.getAll();
        model.addAttribute("departureForm", departures);
        return "departurelist";
    }
}
