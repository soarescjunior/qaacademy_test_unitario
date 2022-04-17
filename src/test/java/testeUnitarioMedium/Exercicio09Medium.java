package testeUnitarioMedium;

import medium.Exercicio09;
import org.junit.Assert;
import org.junit.Test;

public class Exercicio09Medium {

    @Test

    public void validarNomeENumeroAluno() {

        String[] vetorAlunos = {"Flavio", "Reinaldo", "Samuel", "Edmond", "Pedro"};
        int[] vetorNumeroAlunos = {1, 2, 3, 4, 5};

        Exercicio09 exercicio09 = new Exercicio09();

        Assert.assertArrayEquals(vetorAlunos, exercicio09.exibeAlunos(vetorAlunos));
        Assert.assertArrayEquals(vetorNumeroAlunos, exercicio09.exibeNumerosAluno(vetorNumeroAlunos));
        exercicio09.Exibir(vetorAlunos,vetorNumeroAlunos);

    }


}
