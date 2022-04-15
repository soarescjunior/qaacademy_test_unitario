package testeUnitarioEasy;

import easy.Exercicio03;
import easy.Exercicio04;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio04Easy {

    @Test
            public void exibirValorDuplicado(){

        String mensagem = "O valor duplicado é: " + 40;

        Exercicio04 exercicio04 = new Exercicio04();
        Assert.assertEquals(mensagem, exercicio04.dobroDoNumeroInteiroDigitado(20));

    }



}
