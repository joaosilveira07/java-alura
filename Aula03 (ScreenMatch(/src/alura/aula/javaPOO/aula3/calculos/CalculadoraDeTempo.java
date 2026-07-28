package alura.aula.javaPOO.aula3.calculos;
import alura.aula.javaPOO.aula3.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal(){
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoMinutos();
//    }
//
//    public void inclui(Series s){
//        tempoTotal += s.getDuracaoMinutos();
//    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoMinutos();
    }
}
