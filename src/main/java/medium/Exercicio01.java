package medium;

public class Exercicio01 {

    // Exercício 1 - Faça um algoritmo para verificar e exibir de 0 a 100, quais são
    // os números Pares e ímpares.

    public String[] verificarParOuImpar() {
        String[] vetorSoma = new String[102];
        int i=0;
        while (i <= 101) {
            if (i % 2 == 0) {
                vetorSoma[i] = "numero: " + i + " é par";        
            } else{
                vetorSoma[i] = "numero: " + i + " é impar";
            }
            i++;
        }
        return vetorSoma;
    }

}
