package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/")
    public String getView() {
        return "Hello World!!!";
    }

    @GetMapping("/workout")
    public String getWorkout() {
        return "Run 5K OMG!!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
}
