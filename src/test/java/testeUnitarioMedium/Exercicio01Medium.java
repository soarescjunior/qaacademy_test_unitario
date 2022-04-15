package testeUnitarioMedium;

import medium.Exercicio01;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio01Medium {

    @Test

    public void validarParOuImpar(){

        Exercicio01 exercicio01 = new Exercicio01();
        String [] vetorValidar = exercicio01.verificarParOuImpar();
        Assert.assertArrayEquals(vetorValidar, exercicio01.verificarParOuImpar());

    }



}
