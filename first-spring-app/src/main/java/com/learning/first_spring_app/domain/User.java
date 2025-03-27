package com.learning.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Pra nao precisar escrever todo o codigo geter e 
@Getter
@Setter
@AllArgsConstructor
public class User {
    
    private String name;
    private String email;
}
