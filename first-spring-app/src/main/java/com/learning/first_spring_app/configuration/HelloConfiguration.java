package com.learning.first_spring_app.configuration;

// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // indica para o spring que utilize essa classe como base para injetar as dependencias
public class HelloConfiguration {
    
    // @Bean // criar instancia de classes que não podem ser gerenciadas pelo spring (Classes de lib de terceiros)
    // Por padrao as instancias geradas sao do escopo singleton
    // public SDKAWS sdkaws() {
    //     return new SDKAWS();
    // }
}
