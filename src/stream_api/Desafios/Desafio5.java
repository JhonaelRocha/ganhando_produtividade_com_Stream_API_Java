package stream_api.Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    // Desafio 5 - Calcule a média dos números maiores que 5:
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMaiores5 = numeros.stream().filter(n -> n > 5 ).toList();

        Integer mediaMaiores5 = numerosMaiores5.stream().reduce(0, (n,m) -> n + m) / numerosMaiores5.size();

        System.out.println(mediaMaiores5);
        
    }

}