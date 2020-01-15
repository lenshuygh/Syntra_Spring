package be.lens.spring.baeldung_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    static String[] products = {"Cheese","Bacon","Tomatoes","Lettuce"};

    @ModelAttribute("products")
    public String[] getProducts(){
        return products;
    }

    @GetMapping("/products")
    public String products(){
        return "products";
    }

    @PostMapping("/products")
    public ModelAndView productAction(@RequestParam("productField") String product,@RequestParam("productIndex") int index){
        products[index] = product;
        return new ModelAndView("products");
    }

}
