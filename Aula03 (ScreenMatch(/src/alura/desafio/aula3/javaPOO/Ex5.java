package alura.desafio.aula3.javaPOO;

public class Ex5 {
    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.printf("Título: %s %n", getTitulo());
        System.out.printf("Autor: %s %n", getAutor());
    }
}
