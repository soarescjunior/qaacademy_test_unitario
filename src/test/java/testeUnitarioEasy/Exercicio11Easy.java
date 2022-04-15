package testeUnitarioEasy;

import easy.Exercicio11;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio11Easy {

    @Test

    public void validarNumeroMaisDoisAte100Iteracoes(){

        Exercicio11 exercicio11 = new Exercicio11();
        int [] vetorValidar100Itercaoes = exercicio11.numeroMaisDoisAte100Iteracoes(10);
        exercicio11.numeroMaisDoisAte100Iteracoes(10);
        Assert.assertArrayEquals(vetorValidar100Itercaoes, exercicio11.numeroMaisDoisAte100Iteracoes(10));
    }

}
