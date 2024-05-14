package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController

public class PalindromoController {

    @GetMapping("palindromo")
    public  String soma(@RequestParam String r ) {

        String palavraInvertida = "";

        for(int i = r.length()-1; i>=0; i--) {

            palavraInvertida += r.charAt(i);
        }

        if(r.equals(palavraInvertida)) {

            return "É um palindramo";
        } else {

            return  "Não é um palíndromo";
        }

    }

}
