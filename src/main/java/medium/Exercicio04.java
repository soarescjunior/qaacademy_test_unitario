package medium;

public class Exercicio04 {

    // Exercício 4 - Faça um algoritmo para calcular e exibir a multiplicação de
    // todos os números de 1 a 1000.
    // E toda vez que resultado chegar ou ultrapassar 1000,
    // faça que o resultado das multiplicações volte a ser 1.

    public int[] multiplicacaoDeZeroAMil() {

        int i=1; 
        int saldo =1;

        int [] vetorSoma = new int[1001];

        while(i <= 1000){
            vetorSoma[i] = saldo;
            saldo = i * saldo;
            
            if( saldo >= 1000){

                saldo = 1;

            }
               i++;
              
        }

        return vetorSoma;
        

    }

        public int[] itercaoDeZeroAMil() {

            int i=1; 
            int saldo =1;
    
            int [] vetorIteracao = new int[1001];
    
            while(i <= 1000){
    
                saldo = i * saldo;
                vetorIteracao[i] = i;
                if( saldo >= 1000){
    
                    saldo = 1;
    
                }
                   i++;
    
                  // System.out.println(saldo);
            }
            return vetorIteracao;

    }

}
