package testeUnitarioMedium;

import medium.Exercicio07;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio07Medium {

    @Test

    public void validarMesesDoAno(){

        Exercicio07 exercicio07 = new Exercicio07();

        String [] validarVetorMeses = exercicio07.MesesDoAno();

        Assert.assertArrayEquals(validarVetorMeses, exercicio07.MesesDoAno());

    }

}
