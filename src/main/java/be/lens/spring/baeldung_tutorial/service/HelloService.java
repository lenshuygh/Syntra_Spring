package be.lens.spring.baeldung_tutorial.service;

import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService implements Hello {
    @Override
    public String sayHello() {
        return "Hello from helloService";
    }
}
