package easy;

public class Exercicio09 {

    // Exercício 9 - Faça um algoritmo para ler um número inteiro entre: 1 a 10,
    // calcular e exibir a tabuada deste número digitado. Ex.: 10 x 1 = 10, .., 10 x
    // 10 = 100.

    public int[] calcularTabuada(int numeroTabuada) {

        int[] vetorTabuada = new int[11];
        int i = 0;
        while (i < 11) {
            vetorTabuada[i] = (i * numeroTabuada);
            i++;
        }
        return vetorTabuada;
    }

}
