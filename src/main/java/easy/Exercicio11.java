package easy;

public class Exercicio11 {
  public char[] soma;

  public int[] numeroMaisDoisAte100Iteracoes(int numeroDigitado) {

    // Exercício 11 - Faça um algoritmo para ler um número inteiro, somar 2 ao
    // número digitado,
    // até completar 100 iterações. Por ex.: Digitou 10. 10+2, 12+2, 14+2, Até
    // completar 100 iterações.

    int[] vetorInteracoes = new int[100];
    int soma = 0;
    int i = 0;
    soma = numeroDigitado;
    while (i <= 99) {
      soma = soma + 2;
      vetorInteracoes[i] = soma;
      i++;
    }
    return vetorInteracoes;
  }
}
