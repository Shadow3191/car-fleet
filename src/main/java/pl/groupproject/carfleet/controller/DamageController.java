package pl.groupproject.carfleet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.groupproject.carfleet.dto.CarInformationDto;
import pl.groupproject.carfleet.model.Damage;
import pl.groupproject.carfleet.service.DamageService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DamageController {

    private final DamageService damageService;

    @GetMapping("/adddamage")
    ModelAndView createAddDamageView() {
        ModelAndView modelAndView = new ModelAndView("adddamage");
        modelAndView.addObject("damage", new Damage());
        return modelAndView;
    }

    @PostMapping("/adddamage")
    public String registration(@ModelAttribute("damage") Damage carsDamage, BindingResult bindingResult) {
        damageService.addDamages(carsDamage);

        return "redirect:/damages";
    }


    @GetMapping("/damages")
    public String damages(Model model) {
        List<Damage> damages = damageService.getAll();
        model.addAttribute("damagesList", damages);
        return "damages";
    }


    //dodawanie, usuwanie, lista, wyszukiwanie, usuwanie jednego po id_car czy damage, usuwanie wszystkich

}
