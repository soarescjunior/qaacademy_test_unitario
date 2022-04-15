package testeUnitarioEasy;

import easy.Exercicio02;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio02Easy {

    @Test
    public void testePalavraDigitada(){
        Exercicio02 exercicio02 = new Exercicio02();
        Assert.assertEquals("palavra", exercicio02.lerExibirUmaPalavra("palavra"));
    }
}
