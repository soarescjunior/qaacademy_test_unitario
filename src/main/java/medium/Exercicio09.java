package medium;
public class Exercicio09 {

        // Exercício 09 - Faça um algoritmo para: Criar dois vetores.Em um vetor:
        // ler e armazenar o nomes de alunos. No outro vetor: ler e armazenar a
        // numeração de cada aluno,
        // de acordo com a ordem inserida no vetor de nomes.
        // E exiba, o Nome e o número correspondente de cada um.

        public void exibeAlunosENumeros(String vetorAlunos[], int vetorNumeroAlunos[]) {
            int i = 0;
            while (i <= 4) {
                System.out.println("Nome do aluno: " + vetorAlunos[i]);
                System.out.println("Numero do Aluno "+ vetorNumeroAlunos[i]);
                i++;
            }
    
        }

    }
