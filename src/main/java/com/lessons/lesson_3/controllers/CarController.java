package com.lessons.lesson_3.controllers;

import com.lessons.lesson_3.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String helloWorld(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping(value = "/car")
    public ModelAndView student() {
        return new ModelAndView("car", "command", new Car());
    }


    @PostMapping(value = "/add_car")
    public String addCar(@ModelAttribute("SpringWeb")Car car, ModelMap model) {
        model.addAttribute("manufacturer", car.getManufacturer());
        model.addAttribute("model", car.getModel());
        model.addAttribute("year", car.getYear());

        return "result";
    }
}
