package Criando_Primeira_Aplicacao.src;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = sc.nextLine();
        System.out.println("Digite o ano de lançamento deste filme: ");
        int anoLancamento = sc.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = sc.nextDouble();
        
        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        sc.close(); 
    }
}
