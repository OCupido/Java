package src;

import java.util.Scanner; //import necessário para utilizar a classe

public class jogo {
    public static void main (String [] arg) {
        //Intância do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println ("Digite o número de pontos do jogador: ");
        pontos = entrada.nextInt();

        if (pontos >= 1000) {
            System.out.println("Você passou para a fase 2!!!");
        }
            System.out.println("Proxima instrução");
        entrada.close();
    }//fim do método main
}//fim da classe jogo
