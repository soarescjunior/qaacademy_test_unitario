package testeUnitarioEasy;

import easy.Exercicio06;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio06Easy {

    @Test

    public void validarMediaAluno(){

        Exercicio06 exercicio06 = new Exercicio06();

        //aprovado
        String msgAprovado = "Voce foi aprovado" + " sua media é: " + 10.0;
        Assert.assertEquals(msgAprovado, exercicio06.calcularMediaAluno(10, 10));

        //reprovado
        String msgReprovado = "Voce foi reprovado " + "sua media é: "  + 4.25;
        Assert.assertEquals(msgReprovado, exercicio06.calcularMediaAluno(4.25, 4.25));

        //exame
        String  msgExame = "Voce ficou de exame " + "sua media é: " + 5.0;
        Assert.assertEquals(msgExame, exercicio06.calcularMediaAluno(5.25, 4.75));
    }
}
