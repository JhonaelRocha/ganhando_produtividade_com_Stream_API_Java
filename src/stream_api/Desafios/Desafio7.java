package stream_api.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    // Desafio 7 - Encontrar o segundo número maior da lista:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosDecrescente = numeros.stream().sorted().skip((numeros.size() - 2)).toList();

        System.out.println(numerosDecrescente.get(0));
        
    }

}