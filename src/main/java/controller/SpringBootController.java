package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Response;

@RestController
@SpringBootApplication
public class SpringBootController {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringBootController.class, args);
    }

    @GetMapping
    public Response get() {
        return new Response("0000");
    }
}
