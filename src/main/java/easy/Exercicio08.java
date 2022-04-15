package easy;

import java.text.DecimalFormat;

public class Exercicio08 {

    // Exercício 8 - Faça um algoritmo para ler um valor de salário,
    // calcular e exibir o valor do salário bruto, valor do salário líquido e o
    // valor do imposto de renda.

    // Base de cálculo Alíquota Dedução
    // de 0,00 até 1.903,98 isento 0
    // de 1.903,99 até 2.826,65 7,50% 142,8
    // de 2.826,66 até 3.751,05 15,00% 354,8
    // de 3.751,06 até 4.664,68 22,50% 636,13
    // a partir de 4.664,68 27,50% 869,36

    public String calculoSalarioBruto(double salarioBruto) {

        DecimalFormat frmt = new DecimalFormat("00.00");
        double valorImpostoRenda = 0.00;

        if (salarioBruto >= 0.00 && salarioBruto <= 1903.98) {
            return "Valor do salario bruto é: " + frmt.format(salarioBruto);
       } else
            ;
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            return "Valor do salario bruto é: " + frmt.format(salarioBruto);

      } else
            ;
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
          return "Valor do salario bruto é: " + frmt.format(salarioBruto);
        } else
            ;
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            return "Valor do salario bruto é: " + frmt.format(salarioBruto);
        } else
            ;
        if (salarioBruto >= 4664.68) {
            return "Valor do salario bruto é: " + frmt.format(salarioBruto);
        } else{

        }
        return  "Salario bruto invalido";
    }

    public String calculoSalarioLiquido(double salarioBruto) {

        double impostoRenda = 0.00;
        double salarioLiquido = 0.00;

        DecimalFormat frmt = new DecimalFormat("00.00");

        if (salarioBruto >= 0.00 && salarioBruto <= 1903.98) {
            salarioLiquido = salarioBruto;
            return "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        } else
            ;
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            impostoRenda = (salarioBruto * 0.075) - 142.80;
            salarioLiquido = salarioBruto - impostoRenda;
            return "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        } else
            ;
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            impostoRenda = (salarioBruto * 0.15) - 354.80;
            salarioLiquido = salarioBruto - impostoRenda;
            return "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        } else
            ;
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            impostoRenda = (salarioBruto * 0.22) - 636.13;
            salarioLiquido = salarioBruto - impostoRenda;
            return "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        } else
            ;
        if (salarioBruto >= 4664.68) {
            impostoRenda = (4664.68 * 0.275) - 869.36;
            salarioLiquido = salarioBruto - impostoRenda;
            return "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        } else{

        }
        return "Salario bruto invalido";

    }

    public String impostoDeRenda(double salarioBruto) {

        double impostoRenda = 0.00;

        DecimalFormat frmt = new DecimalFormat("00.00");

        if (salarioBruto >= 0.00 && salarioBruto <= 1903.98) {
            impostoRenda = 0;
            return "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        } else
            ;
        if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
            impostoRenda = (salarioBruto * 0.075) - 142.80;
            return "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        } else
            ;
        if (salarioBruto >= 2826.66 && salarioBruto <= 3751.05) {
            impostoRenda = (salarioBruto * 0.15) - 354.80;
            return "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        } else
            ;
        if (salarioBruto >= 3751.06 && salarioBruto <= 4664.68) {
            impostoRenda = (salarioBruto * 0.22) - 636.13;
            return "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        } else
            ;
        if (salarioBruto >= 4664.68) {
            impostoRenda = (4664.68 * 0.275) - 869.36;
            return "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        } else {

        }
        return "Salario bruto invalido";
    }

}
