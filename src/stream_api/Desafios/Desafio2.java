package stream_api.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    // Desafio 2 - Imprima a soma dos números pares da lista:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Integer somaDosPares = numeros.stream()
        .filter( n -> n % 2 == 0).mapToInt(n -> n).sum();

        System.out.println(somaDosPares);
        
    }

}