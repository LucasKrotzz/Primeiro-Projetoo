package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ExemploController {

    @GetMapping("ping/teste")
    public String ping(){
        return "Estamos na rota teste";
    }

    @GetMapping("nome/{nome}")
    public String nome(@PathVariable String nome) {
        return "O seu nome é:" + nome;
    }

    @GetMapping("soma")
    public  String soma(@RequestParam int x, @RequestParam int y) {
        return "A soma dos valores é de : " + (x+y);
    }

}
