package easy;

public class Exercicio05 {

    //Exercício 5 - Faça um algoritmo para ler três números inteiros, 
    //armazenar em variáveis, e exibir a soma, a subtração, 
    //multiplicação e a média dos três números digitados.

    public String calcularSoma( int numeroUm, int numeroDois, int numeroTres){
        int soma;
        soma = numeroUm + numeroDois + numeroTres;

        return "A soma é: " + soma;
    }

    public String calcularbutracao( int numeroUm, int numeroDois, int numeroTres){
        int subtracao;
        subtracao = numeroUm - numeroDois - numeroTres;

        return "A subtracao é: " + subtracao;
    }

    public String calcularMultiplicacao( int numeroUm, int numeroDois, int numeroTres){
        int multiplicacao;
        multiplicacao = numeroUm * numeroDois * numeroTres;

        return "A multiplicacao é: " + multiplicacao;
    }

    public String calcularDivisao( int numeroUm, int numeroDois, int numeroTres) {

        int divisao;

        divisao = (numeroUm + numeroDois + numeroTres) / 3;

        return "A divisao é: " + divisao;

    }
    
}
