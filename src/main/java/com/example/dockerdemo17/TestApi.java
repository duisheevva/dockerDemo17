package com.example.dockerdemo17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestApi {


    @GetMapping("/hello")
    public void hello(){
        System.out.println("hello");
    }

    @GetMapping("/bye")
    public void bye(){
        System.out.println("bye");
    }
}
