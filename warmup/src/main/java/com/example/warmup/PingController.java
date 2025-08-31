package com.example.warmup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    // 1. Hello ping
    @GetMapping
    public String helloPing() {
        return "pong";
    }

}