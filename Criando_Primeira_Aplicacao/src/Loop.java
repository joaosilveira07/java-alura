package Criando_Primeira_Aplicacao.src;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int op = 1;
        int cont = 0;

        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme: ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
            cont++;
        }

        do {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
            cont++;
            System.out.println("Digite 0 se quiser parar de avaliar.");
            op = sc.nextInt();
        } while (op != 0);

        System.out.println("Média das avaliações " + mediaAvaliacao / cont);

        sc.close();
    }
}
