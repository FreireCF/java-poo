package Construtores.ExercicioFinal;
import  Construtores.ExercicioFinal.Models.ContaBancaria;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(("\nCadastro de conta bancária"));
        System.out.println("\nDigite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("\nDigite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("\nIrá realizar um depósito inicial (s/n)?");
            char iraDepositar = scanner.nextLine().charAt(0);

        ContaBancaria conta;

        if(iraDepositar == 's') {
                System.out.println("\nDigite o depósito inicial: ");
                double depInicial = scanner.nextDouble();
                scanner.nextLine();
            conta = new ContaBancaria(numeroConta, nomeTitular, depInicial);
        } else {
                conta = new ContaBancaria(numeroConta, nomeTitular);
        }
            System.out.println(conta);
            conta.depositar(1500);

            System.out.println(conta);
            conta.sacar(1000);

            System.out.println(conta);

            scanner.close();
    }
}