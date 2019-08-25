package pl.groupproject.carfleet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainViewController {

    @RequestMapping
    ModelAndView mainView(){
        ModelAndView modelAndView = new ModelAndView("/main");
        return modelAndView;
    }
}