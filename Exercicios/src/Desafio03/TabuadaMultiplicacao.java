package Desafio03;

public class TabuadaMultiplicacao implements Tabuada {
    
    @Override
    public void mostrarTabuada(int num){
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + i * num);
        }
    }
}
