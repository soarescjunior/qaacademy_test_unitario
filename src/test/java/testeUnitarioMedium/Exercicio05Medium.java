package testeUnitarioMedium;

import medium.Exercicio05;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio05Medium {

    @Test

    public void validarMenorValor(){

        int [] vetorNumeros = {1,2,3,4,5};


        Exercicio05 exercicio05 = new Exercicio05();

       Assert.assertEquals(1, exercicio05.verificarMenorValor(vetorNumeros));







    }


}
