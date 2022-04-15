package medium;

import java.text.DecimalFormat;

public class Exercicio02 {

    //Exercício 2 - Faça um algoritmo para ler um valor de investimento, com uma taxa de juros de 5% a.a. 
    //Ao final de 10 anos, exibir o valor investido, valor dos juros, e o total. 
    //Considerando que a remuneração será no regime de juros compostos.

    public String valorInvestido(double valorInvestido) {
        DecimalFormat frmt = new DecimalFormat("0.00");
        double taxa = 0.05, total, valorJuros;
        int ano = 1;
        
        total = valorInvestido;
        while(ano <= 10){
        total = (total * taxa) + total;
        ano++;
        }
        valorJuros = total - valorInvestido;
        
        return "O valor de invetimento incial é: R$ "+ frmt.format(valorInvestido) + "\n"+
        "O valor total do juros é: R$ " + frmt.format(valorJuros) + "\n"+ 
        "O valor total do investimento é: R$ " + frmt.format(total) + "\n";

    }
    
}
