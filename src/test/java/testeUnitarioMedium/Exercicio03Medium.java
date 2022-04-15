package testeUnitarioMedium;

import medium.Exercicio03;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio03Medium {

    @Test

    public void validarSomaTodosOsNumero(){

        Exercicio03 exercicio03 = new Exercicio03();
        int vetorValidarSoma [] = exercicio03.calcularSomaDeZeroAMil();
        int vetorvalidarInteracoes[] = exercicio03.somarIteracoes();

        Assert.assertArrayEquals(vetorValidarSoma, exercicio03.calcularSomaDeZeroAMil());
        Assert.assertArrayEquals(vetorvalidarInteracoes, exercicio03.somarIteracoes());

    }

}
