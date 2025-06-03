package q1;
import q1.Models.*;

public class App {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Clecio", "12345678900");

        EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado(" Comissionado dos Santos", "98765432100", 189, 23.55);

        EmpregadoComissionadoComBase empregadoComissionadoComBase = new EmpregadoComissionadoComBase("Comissionado com Base da Silva", "00000000000", 200, 25, 1250);

        System.out.println(empregado);
        System.out.println(empregadoComissionado);
        System.out.println(empregadoComissionadoComBase);

    }
}