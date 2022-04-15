package easy;

import java.text.DecimalFormat;

public class Exercicio10 {

    // Exercício 10 - Faça um algoritmo para ler um valor de investimento, com uma
    // taxa de juros de 5% a.a.
    // Ao final de 10 anos, exibir o valor investido, valor dos juros e o total com
    // juros.
    // Considerando que a remuneração será no regime de juros simples.

    public String valorInvestido(double valorInvestido) {

        DecimalFormat frmt = new DecimalFormat("00.00");
        double jurosAoano, taxaAoAno = 0, totalComJuros = 0;
        int ano = 1;
        if (valorInvestido <= 0.00) {
            return "Valor digitado de investimento é invalido.";
        } else {
            while (ano <= 10) {
                jurosAoano = valorInvestido * 0.05;
                taxaAoAno = jurosAoano * ano;
                totalComJuros = taxaAoAno + valorInvestido;
                ano++;
            }
            return "Valor do investimento é: R$ " + (frmt.format(valorInvestido));
        }
    }

    public String calculoTaxaAoAno(double valorInvestido) {

        DecimalFormat frmt = new DecimalFormat("0.00");
        double jurosAoano, taxaAoAno = 0, totalComJuros = 0;
        int ano = 1;
        if (valorInvestido <= 0.00) {
            return "Valor digitado de investimento é invalido.";
        } else {
            while (ano <= 10) {
                jurosAoano = valorInvestido * 0.05;
                taxaAoAno = jurosAoano * ano;
                totalComJuros = taxaAoAno + valorInvestido;
                ano++;
            }
            return "Valor do total do juros é: R$ " + (frmt.format(taxaAoAno));
        }
    }

        public String calculoTotalAoAno(double valorInvestido) {

            DecimalFormat frmt = new DecimalFormat("0.00");
            double jurosAoano, taxaAoAno = 0, totalComJuros = 0;
            int ano = 1;
            if (valorInvestido <= 0.00) {
                return "Valor digitado de investimento é invalido.";
            } else {
                while (ano <= 10) {
                    jurosAoano = valorInvestido * 0.05;
                    taxaAoAno = jurosAoano * ano;
                    totalComJuros = taxaAoAno + valorInvestido;
                    ano++;
                }
                return "Valor do total com juros é: R$ " + (frmt.format(totalComJuros));
            }

        }

}
