package testeUnitarioMedium;

import medium.Exercicio10;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio10Medium {

    @Test

    public void validarFibonacci(){

        Exercicio10 exercicio10 = new Exercicio10();

        int validarVetorFibonacci [] = exercicio10.calcularFibonacciVetor(10);

        Assert.assertArrayEquals(validarVetorFibonacci, exercicio10.calcularFibonacciVetor(10));

    }


}
