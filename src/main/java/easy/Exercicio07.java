package easy;

public class Exercicio07 {

    //Exercício 7 - Faça um algoritmo para ler um valor de salário, 
    //calcular e exibir o valor do INSS a ser pago

    // Salário de Contribuição (R$)        Alíquota
    // Até R$ 1.045,00                     7,50%
    // De R$ 1.045,01 a R$ 2.089,60        9%
    // De R$ 2.089,61 até R$ 3.134,40      12%
    // De R$ 3.134,41 até R$ 6.101,06      14%


    public String calcularExibirValorINSS(double salario) {
        double valorINSS;
        if (salario >= 0.00 && salario <= 1045.00) {
            valorINSS = salario * 0.075;
            return String.format("O valor a ser pago no INSS é: R$ %.2f", valorINSS);
        } else ;
        if (salario >= 1045.01 && salario <= 2089.60) {
            valorINSS = salario * 0.09;
            return String.format("O valor a ser pago no INSS é: R$ %.2f", valorINSS);
        } else ;
        if (salario >= 2089.61 && salario <= 3134.40) {
            valorINSS = salario * 0.12;
            return String.format("O valor a ser pago no INSS é: R$ %.2f", valorINSS);
        } else ;
        if (salario >= 3134.41 && salario <= 6101.06) {
            valorINSS = salario * 0.14;
            return String.format("O valor a ser pago no INSS é: R$ %.2f", valorINSS);
        } else ;
        if (salario >= 6101.07) {
            valorINSS = 6101.07 * 0.14;
            return String.format("O valor a ser pago no INSS é: R$ %.2f", valorINSS);
       /* } if(salario < 0){
             return "salario invalido";
            }*/
        }
        return "Salario invalido";

    }
    
}
