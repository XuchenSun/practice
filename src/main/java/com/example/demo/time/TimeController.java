package com.example.demo.time;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "api/v1/time")
public class TimeController {
    @GetMapping
    public LocalDateTime getTime(){
        LocalDateTime now = LocalDateTime.now();
        return now;
    }
}
