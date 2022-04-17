package testeUnitarioMedium;

import medium.Exercicio04;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio04Medium {

    @Test

    public void validarMultiplicacoes(){

        Exercicio04 exercicio04 = new Exercicio04();

        int[] vetorValidarSoma = exercicio04.multiplicacaoDeZeroAMil();
        int[] vetorValidarIteracao = exercicio04.iteracaoDeZeroAMil();

        Assert.assertArrayEquals(vetorValidarSoma, exercicio04.multiplicacaoDeZeroAMil());
        Assert.assertArrayEquals(vetorValidarIteracao, exercicio04.iteracaoDeZeroAMil());

    }
}
