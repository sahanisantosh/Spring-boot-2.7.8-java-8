package com.testold.testoldversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestOldVersionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestOldVersionApplication.class, args);
    }

    @GetMapping(path = "/", produces = "application/json")
    public String getHelloWorld() {
        return "Hello, Santosh Sahani!";
    }
}
