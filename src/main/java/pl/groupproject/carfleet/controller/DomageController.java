package pl.groupproject.carfleet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.groupproject.carfleet.model.Damage;
import pl.groupproject.carfleet.model.DamageType;
import pl.groupproject.carfleet.service.CarService;
import pl.groupproject.carfleet.service.DamageService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DomageController {

    private final CarService service;
    private final DamageService damageService;

//    @GetMapping("/damages")
//    public String allDomages(Model model) {
//        List<Damage> damages = damageService.getAll();
//        model.addAttribute("damageList", damages);
//        return "damages";
//    }

    @GetMapping("/addDamage")
    public String addDamages(Model model) {
        model.addAttribute("carsDamage", new Damage());
        return "addDamage";
    }

    @PostMapping("/addDamage")
    public String registration(@ModelAttribute("carsDamage") Damage carsDamage, BindingResult bindingResult) {
        damageService.addDamages(carsDamage);

        return "redirect:/damages";
    }

    //dodawanie, usuwanie, lista, wyszukiwanie, usuwanie jednego po id_car czy damage, usuwanie wszystkich

}
