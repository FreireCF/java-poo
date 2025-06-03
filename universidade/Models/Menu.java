package Models;

import java.util.Scanner;

public class Menu {
    public byte opc;
    Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public byte menu() {
        System.out.println("\n_____________________________________MENU_____________________________________");
        System.out.println("\n| [1]  - CADASTRAR DEPARTAMENTO                                              |");
        System.out.println("\n| [2]  - CADASTRAR FUNCIONÁRIO TÉCNICO                                       |");
        System.out.println("\n| [3]  - CADASTRAR FUNCIONÁRIO DOCENTE                                       |");
        System.out.println("\n| [4]  - BUSCAR DEPARTAMENTO POR NOME                                        |");
        System.out.println("\n| [5]  - BUSCAR FUNCIONÁRIO POR NOME                                         |");
        System.out.println("\n| [6]  - LISTAR DEPARTAMENTO COM FUNCIONÁRIOS POR FAIXA SALARIAL ESPECÍFICA  |");
        System.out.println("\n| [7]  - LISTAR FUNCIONÁRIOS POR FAIXA SALARIAL ESPECÍFICA                   |");
        System.out.println("\n| [8]  - LISTAR DEPARTAMENTO POR FAIXA DE GASTO ESPECÍFICA                   |");
        System.out.println("\n| [9]  - LISTAR TODOS OS FUNCIONÁRIOS DA UNIVERSIDADE                        |");
        System.out.println("\n| [10] - LISTAR TODOS OS DEPARTAMENTOS DA UNIVERSIDADE                       |");
        System.out.println("\n| [11] - LISTAR TODOS OS DEPARTAMENTOS E SEUS RESPECTIVOS FUNCIONÁRIOS       |");
        System.out.println("\n| [12] - LISTAR TODOS OS FUNCIONÁRIOS DOCENTES                               |");
        System.out.println("\n| [13] - LISTAR TODOS OS FUNCIONÁRIOS TÉCNICOS                               |");
        System.out.println("\n| [0]  - SAIR                                                                |");
        System.out.println("\n______________________________________________________________________________");
        this.opc = this.scanner.nextByte();
        this.scanner.nextLine();
        return this.opc;
    }
}
