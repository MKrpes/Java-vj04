package com.example.vj04.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class GreetingController {
    AtomicInteger counter=new AtomicInteger(0);
    @GetMapping("/greeting")
    public Greeting sayHello(@RequestParam(name="name",defaultValue = "VSITE") String name) {
        return new Greeting(counter.incrementAndGet(), "Hello" + name + "!");
    }
}