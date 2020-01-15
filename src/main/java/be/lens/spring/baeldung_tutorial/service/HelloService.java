package be.lens.spring.baeldung_tutorial.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("helloService")
public class HelloService implements Hello {
    @Override
    public String sayHello() {
        return "Hello from helloService";
    }

    @PostConstruct
    private void afterBean(){
        System.out.println("POSTCONSTRUCT");
    }

    @PreDestroy
    private void beforeDestroy(){
        System.out.println("PREDESTROY");
    }
}
