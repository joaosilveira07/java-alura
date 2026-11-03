package Criando_Primeira_Aplicacao.aula03_jogo_adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int numGerado = new Random().nextInt(100);
        int numUser;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println("Tente adivinhar o número, entre 1 a 100: ");
            numUser = sc.nextInt();
            if (numUser == numGerado){
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (numUser > numGerado){
                System.out.println("Errado! Tente novamente.");
                System.out.println("Vou te dar uma dica, o número que você digitou é maior que o número que deve acertar!");
            } else {
                System.out.println("Errado! Tente novamente.");
                System.out.println("Vou te dar uma dica, o número que você digitou é menor que o número que deve acertar!");
            }
        }


        sc.close();
    }
}
