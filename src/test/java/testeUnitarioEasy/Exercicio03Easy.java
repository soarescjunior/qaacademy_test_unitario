package testeUnitarioEasy;

import easy.Exercicio02;
import easy.Exercicio03;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio03Easy {

    @Test
    public void exibiValoresTrocados(){

        String mensagem = "numero um é " + 10 + " e " + "numero dois é: " + 20;

        Exercicio03 exercicio03 = new Exercicio03();

        Assert.assertEquals(mensagem, exercicio03.lerDoisValoresExibirValoresTrocados(20,10));

    }
}

