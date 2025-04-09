package wilker.abstracao.banco;
import wilker.abstracao.banco.Models.Cliente;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("\nDigite o nome do cliente: ");
            cliente.nome = scanner.nextLine();

        System.out.println("\nDigite o número da conta do "+cliente.nome+": ");
            cliente.numeroConta = scanner.nextLine();

        System.out.println("\nDigite o saldo do "+cliente.nome+": ");
            cliente.saldo = scanner.nextDouble();
            scanner.nextLine();

        cliente.depositar();
        scanner.close();
    }
}
