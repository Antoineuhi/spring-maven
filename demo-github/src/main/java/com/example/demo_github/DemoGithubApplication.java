package com.example.demo_github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemoApplication.class, args);
    }
}


@RestController
class HelloWorldController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World!";
    }
}

