package easy;

public class Exercicio05 {

    //Exerc�cio 5 - Fa�a um algoritmo para ler tr�s n�meros inteiros, 
    //armazenar em vari�veis, e exibir a soma, a subtra��o, 
    //multiplica��o e a m�dia dos tr�s n�meros digitados.

    public String calcularSoma( int numeroUm, int numeroDois, int numeroTres){
        int soma;
        soma = numeroUm + numeroDois + numeroTres;

        return "A soma �: " + soma;
    }

    public String calcularbutracao( int numeroUm, int numeroDois, int numeroTres){
        int subtracao;
        subtracao = numeroUm - numeroDois - numeroTres;

        return "A subtracao �: " + subtracao;
    }

    public String calcularMultiplicacao( int numeroUm, int numeroDois, int numeroTres){
        int multiplicacao;
        multiplicacao = numeroUm * numeroDois * numeroTres;

        return "A multiplicacao �: " + multiplicacao;
    }

    public String calcularDivisao( int numeroUm, int numeroDois, int numeroTres) {

        int divisao;

        divisao = (numeroUm + numeroDois + numeroTres) / 3;

        return "A divisao �: " + divisao;

    }
    
}
