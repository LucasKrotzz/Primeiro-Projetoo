package com.example.atividades.AtividadeController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Atividades {

    @GetMapping("exp1")
    public String enx1(@RequestParam int binario){
        return "O numero convertido é de " + Integer.parseInt(String.valueOf(binario), 2);
    }

    @GetMapping("exp2")
    private int traduzirNumeralRomano(String texto) {
        int n = 0;
        int numeralDaDireita = 0;
        for (int i = texto.length() - 1; i >= 0; i--) {
            int valor = (int) traduzirNumeralRomano(texto.charAt(i));
            n += valor * Math.signum(valor + 0.5 - numeralDaDireita);
            numeralDaDireita = valor;
        }
        return n;
    }

    private double traduzirNumeralRomano(char caractere) {
        return Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
    }

    @GetMapping("exp3")
    public int calculoFatorial(int f) {
        int result = 1;

        for(int i = 1; i <= f; i++) {
            result = result * i;

        }
        return result;
    }

    @GetMapping("exp4")
    public static boolean palindromo(String s){
        StringBuilder buffer = new StringBuilder();
        buffer.reverse();
        String data = buffer.toString();

        if(s.equals(data)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "level";
        String s2 = "cool";
        String s3 = "Madam";
        String s4 = "Now, sir, a war is won!";
        boolean b1 = palindromo(s1);
        boolean b2 = palindromo(s2);
        boolean b3 = palindromo(s3);
        boolean b4 = palindromo(s4);
        System.out.println("É " + s1 + " um palíndromo? " + b1);
        System.out.println("É " + s2 + " um palíndromo? " + b2);
        System.out.println("É " + s3 + " um palíndromo? " + b3);
        System.out.println("É " + s4 + " um palíndromo? " + b4);
}
}
