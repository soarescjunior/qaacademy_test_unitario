package medium;

import javax.swing.JOptionPane;

public class Exercicio08 {

    //Exercício 8 - Faça um algoritmo para exibir todos os meses digitados anteriormente.

   public String[] mesesDigitados(String[] vetorMeses) {
       int i = 1;
       while (i <= 12) {
           i++;
       }
        return vetorMeses;
    }

    public String[] ExibirMesesDigitados(String[] vetorMeses) {
        int i = 1;
        while (i <= 12) {
            System.out.println("Você Digitou " + vetorMeses[i-1]);
            i++;
        }
        return vetorMeses;
    }

}