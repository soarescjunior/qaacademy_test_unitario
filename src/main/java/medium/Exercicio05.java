package medium;

public class Exercicio05 {

    // Exercício 5 - Faça um algoritmo para ler 5 números, verificar e exibir,
    // quais dos 5 números digitados, é o menor.

    public int verificarMenorValor(int[] vetorNumeros) {

        int numeroDigitado, i = 1, valorMenor = 0;

        while (i < 5) {

            numeroDigitado = vetorNumeros[i - 1];
            if (numeroDigitado < valorMenor || i == 1) {
                valorMenor = numeroDigitado;
            } else {

            }
            i++;
        }

        return valorMenor;
    }
}
