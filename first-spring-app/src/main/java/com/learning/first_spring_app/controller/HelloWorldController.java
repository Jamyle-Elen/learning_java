package com.learning.first_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.first_spring_app.domain.User;
import com.learning.first_spring_app.service.HelloWorldService;

// Combinação de @Contoller e @ResponseBody (Pq um controller não necessariamente precisa retornar um body)
@RestController
// Podemos ter uma api STATELESS -> token, a cada nova requisição eu recebo todas as informaçoes que eu preciso apra fazer auqela fucionalidade que o cliente ta pedindo;
// STATEFULL -> o estado de cada cliente é mantido no servidor
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    // Ao inves de injetar assim podemos utilizar a anotação @Autowired
    // public HelloWorldController(HelloWorldService helloWorldService) {
    //     this.helloWorldService = helloWorldService;
    // }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Jamyle");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + filter;
    }
}
