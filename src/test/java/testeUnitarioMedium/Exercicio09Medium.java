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

        //Test Unitario Nome Aluno
        Assert.assertArrayEquals(vetorAlunos, exercicio09.exibeAlunos(vetorAlunos));

        //Test Unitario Numero Aluno
        Assert.assertArrayEquals(vetorNumeroAlunos, exercicio09.exibeNumerosAluno(vetorNumeroAlunos));

        //Exibir Resultado
        exercicio09.Exibir(vetorAlunos,vetorNumeroAlunos);

    }


}
