package alura.aula.javaPOO.aula3.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos da galera!");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado no momento.");
        } else {
            System.out.println("Vale a pena assistir!");
        }
    }
}
