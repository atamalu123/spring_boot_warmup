package com.example.warmup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

    // 2. Path & Query params
    @GetMapping("/{name}")
    public String getGreet(@PathVariable String name, @RequestParam boolean yell) {
        if(yell) {
            return "HELLO, " + name + "!";
        } else {
            return "Hello, " + name + ".";
        }
    }

}