package com.microservice.cartservice.gitactionsexamples.sampleController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world....";
    }
}
