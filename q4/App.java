import Models.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        int num;
        byte opc = 0;

        do {
            opc = menu.menu();
            switch (opc){
                case 1:
                    System.out.println("\nDigite um número para inserir no início da lista: ");
                        num = scanner.nextInt();
                        scanner.nextLine();

                    lista.inserirElemento(num);
                    System.out.println("\nLista após inserção: ");
                        lista.exibir();
                    break;
                case 2:
                    System.out.println("\nLista desordenada: ");
                        lista.exibir();

                    System.out.println("\nLista ordenada: ");
                        lista.ordenar();
                        lista.exibir();
                    break;
                case 3:
                    System.out.println("\nLista atual: ");
                        lista.exibir();
                    System.out.println("\nDigite um número para remover da lista: ");
                        num = scanner.nextInt();
                        scanner.nextLine();
                            System.out.println("\nLista antes da remoção: ");
                            lista.exibir();
                           System.out.println("\nLista após a remoção: ");
                            lista.remover(num);
                            lista.exibir();
                    break;
                case 4:
                    System.out.println("\n" +lista.getTam() + " números armazenadaos na lista");
                    break;
                case 5:
                    System.out.println("\nDigite a posição (a primeira posição é 0): ");
                        num = scanner.nextInt();
                        scanner.nextLine();
                    lista.informarValorNaPos(num);
                    break;
                case 6:
                    lista.exibir();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        } while (opc != 0);
    }
}