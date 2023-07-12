package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Response;

@RestController
@SpringBootApplication
public class ExampleController {
    
    public static void main(String[] args) {
        SpringApplication.run(ExampleController.class, args);
    }

    @GetMapping
    public Response get() {
        return new Response("0000");
    }

    @GetMapping(path = "/error")
    public Response getError() {
        return new Response("0001");
    }
}
