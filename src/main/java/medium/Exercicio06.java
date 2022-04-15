package medium;

public class Exercicio06 {

    // Exercício 6 - Faça um algoritmo para ler um número inteiro, calcular e exibir
    // o Fatorial do número digitado. Ex.: Digitou 10. 10*(10-1)*(10-2)*(10-3)..
    // *(10-1) = 3.628.800

    public int calculaFatorial(int numero) {

        int Fatorial, i = 1;

        Fatorial = numero;
        i = Fatorial;
        while (i > 1) {
            Fatorial = Fatorial * (i - 1);

            i = i - 1;
        }
        return Fatorial;

    }

}
