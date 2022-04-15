package easy;

public class Exercicio05 {

    //Exercício 5 - Faça um algoritmo para ler três números inteiros, 
    //armazenar em variáveis, e exibir a soma, a subtração, 
    //multiplicação e a média dos três números digitados.

    public String calculaOperracoesAritimeticas( int numeroUm, int numeroDois, int numeroTres) {
        
        int soma, subtracao, divisao, multiplicacao;
        
        soma = numeroUm + numeroDois + numeroTres;
        subtracao = numeroUm - numeroDois - numeroTres;
        multiplicacao = numeroUm * numeroDois * numeroTres;
        divisao = soma / 3;

        return "A soma é: " + soma + "\n" + "A subtração é: " + subtracao 
        + "\n" + "A multiplicação: " + multiplicacao + "\n" + "A divisao é: " + divisao ;
    
    }
    
}
