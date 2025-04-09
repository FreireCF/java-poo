package wilker.abstracao.banco.Models;
import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    public String nome;
    public String numeroConta; //usando String para evitar problemas com num. iniciados com 0 (q seria ignorado)
    public double saldo;

    public void depositar() {
        System.out.println("\nDeseja realizar um depósito? ");
        System.out.println("\n[1] - SIM");
        System.out.println("\n[2] - NÃO");
        byte realizarDeposito = scanner.nextByte();
        if (realizarDeposito == 1) {
            System.out.println("\nDigite o valor do depósito: ");
            double valorDeposito= scanner.nextDouble();
            scanner.nextLine();
            saldo += valorDeposito;
            System.out.println("Depósito de R$ " + valorDeposito + " efetuado com sucesso");
        } else {
            System.out.println("\nSaindo do programa");
        }
        scanner.close();
    }
}
