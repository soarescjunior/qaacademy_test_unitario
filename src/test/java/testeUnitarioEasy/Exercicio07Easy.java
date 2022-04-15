package testeUnitarioEasy;

import easy.Exercicio07;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio07Easy {

    @Test

    public void validarValorInss(){

        Exercicio07 exercicio07 = new Exercicio07();

        String msgINSS0075 = "O valor a ser pago no INSS é: R$ 78,38";
        Assert.assertEquals(msgINSS0075, exercicio07.calcularExibirValorINSS(1045.00));

        String msgINSS009 = "O valor a ser pago no INSS é: R$ 184,50";
        Assert.assertEquals(msgINSS009, exercicio07.calcularExibirValorINSS(2050.00));

        String msgINSS012 = "O valor a ser pago no INSS é: R$ 360,00";
        Assert.assertEquals(msgINSS012, exercicio07.calcularExibirValorINSS(3000.00));

        String msgINSS014 = "O valor a ser pago no INSS é: R$ 840,00";
        Assert.assertEquals(msgINSS014, exercicio07.calcularExibirValorINSS(6000.00));

        String msgINSSVlrMAior = "O valor a ser pago no INSS é: R$ 854,15";
        Assert.assertEquals(msgINSSVlrMAior, exercicio07.calcularExibirValorINSS(10000.00));

        String msgSalarioInvalido = "Salario invalido";
        Assert.assertEquals(msgSalarioInvalido, exercicio07.calcularExibirValorINSS(-1));
    }
}
