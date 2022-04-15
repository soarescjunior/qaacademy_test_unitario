package medium;

public class Exercicio03 {

    // Exercício 3 - Faça um algoritmo para calcular e exibir a soma de todos os
    // números de 0 a 1000.
    // E parar se caso a soma atingir 1500(ou mais).

    public int[] calcularSomaDeZeroAMil() {
        int[] vetorSoma = new int[1500];
        int i = 0, soma = 0;

        while (i <= 1000) {
            soma = soma + i;
            vetorSoma[i] = soma;
            i++;
        }
        return vetorSoma;

    }

    public int[] somarIteracoes() {
        int[] vetorIteracoes = new int[1001];
        int i = 0;                                              
        while (i <= 1000) {
            vetorIteracoes[i] = i;
            i++;
        }
        return vetorIteracoes;

    }

}
