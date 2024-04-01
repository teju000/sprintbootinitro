package com.firstproject.springbootintro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/greet")
    public String sayHello(){
        System.out.println("Reached inside the Hello app");
        return "Hello , Good morning";
    }
    @GetMapping("/bye")
    public String sayBye(){
        System.out.println("Bye Bye");
        return "Bye Bye , class done";
    }

    @GetMapping("/greetings")
    public String sayHello(@RequestParam("name") String name){
        return "Hello "+ name +" , Have a great day.";
    }
}
