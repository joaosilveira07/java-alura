package alura.desafio.aula3.javaPOO;

public class Main {
    public static void main(String[] args) {
        // -- Ex1 --
        Ex1 c1 = new Ex1();
        c1.setNumConta(123);
        c1.setSaldo(583.50);
        c1.titular = "João";

        System.out.printf("Número da conta: %d %n", c1.getNumConta());
        System.out.printf("Saldo: %.2f %n", c1.getSaldo());
        System.out.printf("Titular da conta: %s %n", c1.titular);

        c1.setSaldo(1500);
        System.out.printf("Novo saldo: %.2f %n", c1.getSaldo());

        // -- Ex2 --
        Ex2 p1 = new Ex2();
        p1.setIdade(17);
        p1.setNome("João");
        p1.verificarIdade(p1.getIdade());

        p1.setIdade(19);
        p1.verificarIdade(p1.getIdade());

        // -- Ex3 --
        Ex3 produto1 = new Ex3();
        produto1.setNome("Shampoo");
        produto1.setPreco(25.90);
        System.out.printf("Nome do produto: %s %n", produto1.getNome());
        System.out.printf("Preço: %.2f %n", produto1.getPreco());

        produto1.aplicarDesconto(10);
        System.out.printf("Preço com desconto: %.2f %n", produto1.getPreco());

        // -- Ex4 --
        Ex4 a1 = new Ex4();
        a1.setNome("João");
        a1.setNota1(6.5);
        a1.setNota2(7);
        a1.setNota3(3.2);

        System.out.printf("A média do aluno %s é: %.2f %n", a1.getNome(), a1.calcularMedia());

        // -- Ex5 --
        Ex5 l1 = new Ex5();
        l1.setTitulo("Dom Casmurro");
        l1.setAutor("Machado de Assis");
        l1.exibirDetalhes();
        Ex5 l2 = new Ex5();
        l2.setTitulo("Pequeno Príncipe");
        l2.setAutor("Antoine de Saint-Exupéry");
        l2.exibirDetalhes();
    }
}
