package ru.sber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}