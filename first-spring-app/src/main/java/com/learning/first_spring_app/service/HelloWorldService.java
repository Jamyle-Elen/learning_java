package com.learning.first_spring_app.service;

import org.springframework.stereotype.Service;

// Vai indicar para o spting que essa classe de service e ta sendo gerenciada pelo spring
@Service
public class HelloWorldService {
    
    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
