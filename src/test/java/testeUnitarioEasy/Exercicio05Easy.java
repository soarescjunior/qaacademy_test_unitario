package testeUnitarioEasy;

import easy.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio05Easy {

    @Test

    public void validarCalculoAritmetico(){

        String mensagem = "A soma é: " + 60 + "\n" + "A subtração é: " + -40
                + "\n" + "A multiplicação: " + 6000 + "\n" + "A divisao é: " + 20 ;

        Exercicio05 exercicio05 = new Exercicio05();
       Assert.assertEquals(mensagem,exercicio05.calculaOperracoesAritimeticas(10,20,30));

    }

}
