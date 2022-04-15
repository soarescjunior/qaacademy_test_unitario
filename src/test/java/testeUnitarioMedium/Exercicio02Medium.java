package testeUnitarioMedium;

import medium.Exercicio02;
import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class Exercicio02Medium {

    @Test

    public void valoresInvestimento(){
        DecimalFormat frmt = new DecimalFormat("0.00");
        Exercicio02 exercicio02 = new Exercicio02();

        String msgValorInvestido = "O valor de invetimento incial é: R$ "+ frmt.format(1000.00);
        String msgValorTotalJuros = "O valor total do juros é: R$ " + frmt.format(628.89);
        String msgValorTotaInvestimento = "O valor total do investimento é: R$ " + frmt.format(1628.89);

        Assert.assertEquals(msgValorInvestido,exercicio02.valorInvestido(1000.00));
        Assert.assertEquals(msgValorTotalJuros, exercicio02.valorTotalJuros(1000.00));
        Assert.assertEquals(msgValorTotaInvestimento, exercicio02.valorTotalInvestimento(1000.00));
    }
}
