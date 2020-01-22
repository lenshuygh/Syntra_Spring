package be.lens.spring.baeldung_tutorial.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.LinkedList;
import java.util.List;

@Controller
public class ProductController {
    static List<String> products = new LinkedList<>();

    public ProductController() {
        products.add("Cheese");
        products.add("Bacon");
        products.add("Tomatoes");
        products.add("Lettuce");
    }

    @ModelAttribute("products")
    public List<String> getProducts() {
        return products;
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }

    @PostMapping(value = "/products", params = "action=change")
    public ModelAndView productChange(@RequestParam("productField") String product, @RequestParam("productIndex") int index) {
        //products[index] = product;
        this.products.set(index, product);
        return new ModelAndView("products");
    }

    @PostMapping(value = "/products", params = "action=del")
    public ModelAndView productDelete(@RequestParam("productField") String product, @RequestParam("productIndex") int index) {
        products.remove(index);
        return new ModelAndView("products");
    }

    @PostMapping(value = "/products", params = "add")
    public ModelAndView productAdd(@RequestParam("newProduct") String newProduct) {
        products.add(newProduct);
        return new ModelAndView("products");
    }
}
