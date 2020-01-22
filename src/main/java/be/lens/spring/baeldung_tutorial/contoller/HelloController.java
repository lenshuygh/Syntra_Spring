package be.lens.spring.baeldung_tutorial.contoller;

import be.lens.spring.baeldung_tutorial.service.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    private Hello helloService;

    @Autowired
    public void setHelloService(Hello helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("hello")
    public ModelAndView handleHello() {
        String text = helloService.sayHello();
        return new ModelAndView("helloView", "message", text);
    }
}
