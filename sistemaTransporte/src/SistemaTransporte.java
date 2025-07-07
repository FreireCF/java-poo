package Models;
import Models.*;
import java.util.ArrayList;
import java.util.List;

public class SistemaTransporte {
    public static void main(String[] args) {
        double valorBase = 4;
        // adotei o valor base da passagem como R$ 4,00
        // para estudantes, ficará R$ 2,00 após o desconto de 50%

        List<Passagem> passagens = new ArrayList<>();

        PassagemEstudante etd1 = new PassagemEstudante("Clecio", valorBase );
        PassagemEstudante etd2 = new PassagemEstudante("Kelvyn", valorBase);
        PassagemEstudante etd3 = new PassagemEstudante("Kauã", valorBase);

        Passagem normal1 = new Passagem("Cláudio", valorBase);
        Passagem normal2 = new Passagem("Pedro", valorBase);
        Passagem normal3 = new Passagem("Júlio", valorBase);

        passagens.add(etd1);
        passagens.add(etd2);
        passagens.add(etd3);

        passagens.add(normal1);
        passagens.add(normal2);
        passagens.add(normal3);

        System.out.println(passagens);
    }
}
