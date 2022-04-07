package com.example.DockerHelloWorld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
        public void hello(){
            System.out.println("hello from the controller");
        }
}
