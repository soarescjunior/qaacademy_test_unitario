package testeUnitarioEasy;

import easy.Exercicio09;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio09Easy {

    @Test

    public void validarCalculoTAbuada() {

        Exercicio09 exercicio09 = new Exercicio09();
        int[] vetorTabuada = exercicio09.calcularTabuada(10);
        exercicio09.calcularTabuada(10);
        Assert.assertArrayEquals(vetorTabuada, exercicio09.calcularTabuada(10));

    }

}


