package q1;
import q1.Models.*;

public class App {
    public static void main(String[] args) {
        Peca peca = new Peca("Processador", 789, 99.59f);
        PecaImportada importada = new PecaImportada("Memória RAM", 189.99f, 79.79f, 69, 59);

        System.out.println("\nValor da peça normal: "+peca.calcularPreco());
        System.out.println("\nValor da peça importada: "+importada.calcularPreco());

        System.out.println(peca.exibir());
        System.out.println(importada.exibir());
    }
}
