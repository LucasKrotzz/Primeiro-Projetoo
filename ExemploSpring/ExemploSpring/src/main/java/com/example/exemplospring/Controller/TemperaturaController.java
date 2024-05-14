package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TemperaturaController {


    @GetMapping("temperatura")
    public  String soma(@RequestParam double celsio) {

        double fahrenheit;

        fahrenheit = ( 9 * celsio + 160 )/5;

        return "A temperatura em fahrenheit é de: " + fahrenheit  ;
    }

}
