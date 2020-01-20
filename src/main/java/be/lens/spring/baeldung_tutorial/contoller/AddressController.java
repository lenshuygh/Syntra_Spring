package be.lens.spring.baeldung_tutorial.contoller;

import be.lens.spring.baeldung_tutorial.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class AddressController {
    @GetMapping
    public String displayForm(){
        return "address";
    }

    @PostMapping
    public String processAddress(@ModelAttribute("address") Address address){
        return "addressDetail";
    }
}
