package medium;

import javax.swing.JOptionPane;

public class Exercicio08 {

    //Exercício 8 - Faça um algoritmo para exibir todos os meses digitados anteriormente.

  public static void main(String[] args) {

    String[] vetorMes = new String[12];
    String mesDigitado;
    int i = 0;
    
    while(i<=11){
      mesDigitado = JOptionPane.showInputDialog("digite o mes");
      vetorMes[i] = mesDigitado;
      i++;
    }
    i=0;
    while(i<=11){
    System.out.println("Você Digitou " + vetorMes[i]);
    i++;
    }
  }

}