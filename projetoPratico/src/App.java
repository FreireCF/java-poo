import models.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Livro livro = new Livro("1050", "TESTE");
        livro.addCap("Cap 1", 12);
        livro.addCap("Cap 2", 14);

        System.out.println("\n=== RELATÓRIO DO LIVRO ===");
        livro.exibirRelatorio();
    }
}