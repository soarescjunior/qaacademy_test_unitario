package testeUnitarioEasy;

import easy.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio05Easy {

    @Test

    public void validarSoma(){

        String mensagem = "A soma é: " + 60;

        Exercicio05 exercicio05 = new Exercicio05();
       Assert.assertEquals(mensagem,exercicio05.calcularSoma(10,20,30));
    }

    @Test
    public void validarSubtracao(){

        String mensagem = "A subtracao é: " + 20;

        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(mensagem,exercicio05.calcularbutracao(40,10,10));
    }


    @Test
    public void validarMultiplicacao(){

        String mensagem = "A multiplicacao é: " + 100;

        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(mensagem,exercicio05.calcularMultiplicacao(10,1,10));
    }

    @Test
    public void validarDivisao(){

        String mensagem = "A divisao é: " + 10;

        Exercicio05 exercicio05 = new Exercicio05();
        Assert.assertEquals(mensagem,exercicio05.calcularDivisao(10,10,10));
    }

}
