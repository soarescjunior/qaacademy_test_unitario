package testeUnitarioEasy;

import easy.Exercicio10;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class Exercicio10Easy {

@Test

    public void validarCalculoInvestimento(){
    DecimalFormat frmt = new DecimalFormat("00.00");
    Exercicio10 exercicio10 = new Exercicio10();

    double valorInvestido = 1000.00;
    frmt.format(valorInvestido);

    String msgTaxaAno = "Valor do total do juros é: R$ " + (frmt.format(500.00));
    String msgTotalComJuros = "Valor do total com juros é: R$ " + (frmt.format(1500.00));
    String msgvalorInvestimento= "Valor do investimento é: R$ " + (frmt.format(valorInvestido));

    Assert.assertEquals(msgTaxaAno, exercicio10.calculoTaxaAoAno(valorInvestido));
    Assert.assertEquals(msgTotalComJuros, exercicio10.calculoTotalAoAno(valorInvestido));
    Assert.assertEquals(msgvalorInvestimento, exercicio10.valorInvestido(valorInvestido));

}

}
