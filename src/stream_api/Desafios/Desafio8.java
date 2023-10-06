package stream_api.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    // Desafio 8 - Somar os dígitos de todos os números da lista:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<String> strings = numeros.stream().map(n -> n.toString()).toList();
        
        Integer somaDigitos = strings.stream().flatMapToInt(n -> n.chars()).map(n -> n - '0' ).sum();

        System.out.println(somaDigitos);
        
    }

}