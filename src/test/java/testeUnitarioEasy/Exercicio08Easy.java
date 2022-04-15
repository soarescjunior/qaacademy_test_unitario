package testeUnitarioEasy;

import easy.Exercicio08;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class Exercicio08Easy {

    @Test

    public void validarSalarioEIRZero(){
        DecimalFormat frmt = new DecimalFormat("00.00");
        Exercicio08 exercicio08 = new Exercicio08();


        //Validacoes:
        // /*Salario de 0.00 á 1903.98;*/

        double salarioBruto = 1500.00;
        double salarioLiquido = 1500.00;
        double impostoRenda = 00.00;

        String msgSalarioBruto = "Valor do salario bruto é: " + frmt.format((salarioBruto));
        String msgSalarioLiquido = "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        String msgImpostoRenda = "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        String msgSalarioBrutoInvalido = "Salario bruto invalido";

        Assert.assertEquals(msgSalarioBruto, exercicio08.calculoSalarioBruto(1500.00));
        Assert.assertEquals(msgSalarioLiquido, exercicio08.calculoSalarioLiquido(1500.00));
        Assert.assertEquals(msgImpostoRenda, exercicio08.impostoDeRenda(0.00));
        Assert.assertEquals(msgSalarioBrutoInvalido, exercicio08.calculoSalarioBruto(-15));

    }

        @Test
    public void validarSalarioEIRSeteMeio() {
            DecimalFormat frmt = new DecimalFormat("00.00");
            Exercicio08 exercicio08 = new Exercicio08();


            //Validacoes:
            // /*Salario de 1903.99 á 2826.65;*/

            double salarioBruto = 2255.23;
            double salarioLiquido = 2228.89;
            double impostoRenda = 26.34;

            String msgSalarioBruto = "Valor do salario bruto é: " + frmt.format(salarioBruto);
            String msgSalarioLiquido = "Valor do salario liquido é : " + frmt.format(salarioLiquido);
            String msgImpostoRenda = "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
            String msgSalarioBrutoInvalido = "Salario bruto invalido";

            Assert.assertEquals(msgSalarioBruto, exercicio08.calculoSalarioBruto(2255.23));
            Assert.assertEquals(msgSalarioLiquido, exercicio08.calculoSalarioLiquido(2255.23));
            Assert.assertEquals(msgImpostoRenda, exercicio08.impostoDeRenda(2255.23));
            Assert.assertEquals(msgSalarioBrutoInvalido, exercicio08.calculoSalarioBruto(-15));
        }

    @Test
    public void validarSalarioEIRQuinze() {
        DecimalFormat frmt = new DecimalFormat("00.00");
        Exercicio08 exercicio08 = new Exercicio08();


        //Validacoes:
        // /*Salario de 2826.66 á 3751.05;*/

        double salarioBruto = 3255.47;
        double salarioLiquido = 3121.95;
        double impostoRenda = 133.52;

        String msgSalarioBruto = "Valor do salario bruto é: " + frmt.format(salarioBruto);
        String msgSalarioLiquido = "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        String msgImpostoRenda = "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        String msgSalarioBrutoInvalido = "Salario bruto invalido";

        Assert.assertEquals(msgSalarioBruto, exercicio08.calculoSalarioBruto(3255.47));
        Assert.assertEquals(msgSalarioLiquido, exercicio08.calculoSalarioLiquido(3255.47));
        Assert.assertEquals(msgImpostoRenda, exercicio08.impostoDeRenda(3255.47));
        Assert.assertEquals(msgSalarioBrutoInvalido, exercicio08.calculoSalarioBruto(-15));
    }

    @Test
    public void validarSalarioEIRVinteDois() {
        DecimalFormat frmt = new DecimalFormat("00.00");
        Exercicio08 exercicio08 = new Exercicio08();


        //Validacoes:
        // /*Salario de 3751.06 á 4664.68;*/

        double salarioBruto = 3955.49;
        double salarioLiquido = 3721.41;
        double impostoRenda = 234.08;

        String msgSalarioBruto = "Valor do salario bruto é: " + frmt.format(salarioBruto);
        String msgSalarioLiquido = "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        String msgImpostoRenda = "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        String msgSalarioBrutoInvalido = "Salario bruto invalido";

        Assert.assertEquals(msgSalarioBruto, exercicio08.calculoSalarioBruto(3955.49));
        Assert.assertEquals(msgSalarioLiquido, exercicio08.calculoSalarioLiquido(3955.49));
        Assert.assertEquals(msgImpostoRenda, exercicio08.impostoDeRenda(3955.49));
        Assert.assertEquals(msgSalarioBrutoInvalido, exercicio08.calculoSalarioBruto(-15));
    }

    @Test
    public void validarSalarioEIRVinteSeteMeio() {
        DecimalFormat frmt = new DecimalFormat("00.00");
        Exercicio08 exercicio08 = new Exercicio08();


        //Validacoes:
        // /*Salario Maior de * 4664.68/

        double salarioBruto = 8025.30;
        double salarioLiquido = 7611.87;
        double impostoRenda = 413.43;

        String msgSalarioBruto = "Valor do salario bruto é: " + frmt.format(salarioBruto);
        String msgSalarioLiquido = "Valor do salario liquido é : " + frmt.format(salarioLiquido);
        String msgImpostoRenda = "Seu imposto de Renda é  : " + frmt.format(impostoRenda);
        String msgSalarioBrutoInvalido = "Salario bruto invalido";

        Assert.assertEquals(msgSalarioBruto, exercicio08.calculoSalarioBruto(8025.30));
        Assert.assertEquals(msgSalarioLiquido, exercicio08.calculoSalarioLiquido(8025.30));
        Assert.assertEquals(msgImpostoRenda, exercicio08.impostoDeRenda(8025.30));
        Assert.assertEquals(msgSalarioBrutoInvalido, exercicio08.calculoSalarioBruto(-15));
    }
}
