package Models;

import java.util.Scanner;

public class Menu {
    public byte opc;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
    }

    public byte menu() {
        System.out.println("\n_______________________________MENU______________________________");
        System.out.println("\n| [1]  - INSERIR NÚMERO                                         |");
        System.out.println("\n| [2]  - ORDENAR A LISTA EM ORDEM CRESCENTE                     |");
        System.out.println("\n| [3]  - REMOVER UM NÚMERO                                      |");
        System.out.println("\n| [4]  - INFORMAR A QUANTIDADE DE NÚMEROS ARMAZENADOS           |");
        System.out.println("\n| [5]  - INFORMAR O VALOR ARMAZENADO EM UMA POSIÇÃO ESPECÍFICA  |");
        System.out.println("\n| [6]  - EXIBIR OS NÚMEROS ARMAZENADOS NA LISTA                 |");
        System.out.println("\n| [0]  - SAIR                                                   |");
        System.out.println("\n_________________________________________________________________");
        this.opc = this.scanner.nextByte();
        this.scanner.nextLine();
        return this.opc;
    }
}