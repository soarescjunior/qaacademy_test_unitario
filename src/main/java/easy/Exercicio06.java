package easy;

public class Exercicio06 {

    // Exercício 6 - Faça um algoritmo para ler duas notas, calcular a média.
    // E SE - a média > 5 Exibir aprovado, SE a média < 5 exibir reprovado, se media
    // = 5 exibir exame.

    public String calcularMediaAluno(double notaUm, double notaDois) {
        double media;
            media = (notaUm + notaDois) / 2;
        if (media > 5.0) {
            return ("Voce foi aprovado " + "sua media é: " + media);
        } else
            ;
        if (media < 5.0) {
            return("Voce foi reprovado " + "sua media é: " + media);
        } else
            ;
        if (media == 5.0) {
            return("Voce ficou de exame " + "sua media é: " + media);
        } else{
        }
        return "Nota digitada invalida";
    }

}
