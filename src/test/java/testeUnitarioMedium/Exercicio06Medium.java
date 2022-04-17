package testeUnitarioMedium;

import medium.Exercicio06;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio06Medium {

    @Test

    public void validarCalculoFatorial(){

        Exercicio06 exercicio06 = new Exercicio06();

        Assert.assertEquals(3628800, exercicio06.calculaFatorial(10));


    }
}
