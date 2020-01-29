package be.lens.spring.baeldung_tutorial.controller;

import be.lens.spring.baeldung_tutorial.command.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vehicle")
public class VehicleRegistrationController {
    @GetMapping
    public String getVehicleRegistrationForm(@ModelAttribute("registration") Vehicle vehicle){

        return "VehicleForm";
    }
}
