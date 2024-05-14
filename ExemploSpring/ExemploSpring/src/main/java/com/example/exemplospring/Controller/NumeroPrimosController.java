package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NumeroPrimosController {

    @GetMapping("primo")
    public String nome(@RequestParam int numero) {

        for(int i = 0; i <= numero; i++) {

            boolean primo = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0 ) {

                    primo = false;
                }
            }
            if(primo) {
                return "É um numero primo: " + numero;
            } else {
                return  "Não é um numero primo";
            }
        }


        return "";
    }
}
