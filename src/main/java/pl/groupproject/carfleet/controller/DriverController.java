package pl.groupproject.carfleet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.service.DriverService;
import pl.groupproject.carfleet.validator.UserValidator;

@Controller
public class DriverController {

    private DriverService driverService;

    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("driverForm", new Driver());
        return "/registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("driverForm") Driver driverForm, BindingResult bindingResult){
        userValidator.validate(driverForm, bindingResult);

        if (bindingResult.hasErrors()){
            return "/registration";
        }
        driverService.save(driverForm);

        return "redirect:/welcome";
    }

}