package testeUnitarioMedium;

import medium.Exercicio08;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio08Medium {

    @Test

    public void validarMeses(){

        Exercicio08 exercicio08 = new Exercicio08();

        String[] vetorMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "outubro", "novembro", "dezembro"};

        String validarMesesDigitado [] = exercicio08.mesesDigitados(vetorMeses);

        //Teste Unitario.
        Assert.assertArrayEquals(validarMesesDigitado, exercicio08.mesesDigitados(vetorMeses));

        //Exibir na Tela.
        exercicio08.ExibirMesesDigitados(vetorMeses);

    }

}
