package be.lens.spring.baeldung_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    static List<String> products = Arrays.asList("Cheese", "Bacon", "Tomatoes", "Lettuce");

    @ModelAttribute("products")
    public List<String> getProducts(){
        return products;
    }

    @GetMapping("/products")
    public String products(){
        return "products";
    }

    @PostMapping(value = "/products",params = "action=change")
    public ModelAndView productChange(@RequestParam("productField") String product,@RequestParam("productIndex") int index){
        //products[index] = product;
        this.products.set(index,product);
        return new ModelAndView("products");
    }

    @PostMapping(value = "/products",params = "action=del")
    public ModelAndView productDelete(@RequestParam("productField") String product,@RequestParam("productIndex") int index) {
        this.products.remove(index);
        return new ModelAndView("products");
    }
}
