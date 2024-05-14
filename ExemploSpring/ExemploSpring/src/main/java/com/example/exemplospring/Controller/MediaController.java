package com.example.exemplospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MediaController {

    @GetMapping("media")
    public String nome(@RequestParam int nota1 , @RequestParam int nota2, @RequestParam int nota3) {

        int media , i , contAluno = 0;

        for(i = 0; i < 3; i++) {

            contAluno++;

            media = (nota1 + nota2 + nota3) / 3;

            if(media >= 0 &&  media <4) {

                return "A nota é E";
            } else if (media < 5) {
                return "A nota é D";
            } else if (media < 7) {
                return "A nota é C";
            } else if (media < 8) {
                return "A nota é B";
            } else if (media < 10) {
                return "A nota é A";
            }

        }

        return "";

    }

}
