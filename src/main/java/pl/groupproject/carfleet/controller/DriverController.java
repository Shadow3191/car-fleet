package pl.groupproject.carfleet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.groupproject.carfleet.model.Driver;
import pl.groupproject.carfleet.security.SecurityService;
import pl.groupproject.carfleet.service.DriverService;
import pl.groupproject.carfleet.validator.UserValidator;

@Controller
public class DriverController {

    private DriverService driverService;
    private SecurityService securityService;
    private UserValidator userValidator;

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("driverForm", new Driver());
        return "registration";
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

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "login";
    }

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome(Model model) {
        return "welcome";
    }


}