import models.*;
import models.Frota;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Frota[] frota = new Frota[100];
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String placa, marca, modelo;
        int anoFab, cont =0;
        byte opc;

        do {
            menu.exibir();
            System.out.println("Digite sua opção: ");
                opc = scanner.nextByte();
                scanner.nextLine();

            switch (opc){
                case 1:
                    if(frota.length > 100){
                        System.out.println("\nNúmero de veículos na frota chegou ao máximo");
                        return;
                    }
                    System.out.println("\nDigite a placa: ");
                        placa = scanner.nextLine();
                    System.out.println("\nDigite a marca: ");
                        marca = scanner.nextLine();
                    System.out.println("\nDigite o modelo: ");
                        modelo = scanner.nextLine();
                    System.out.println("\nDigite o ano de fabricação: ");
                        anoFab = scanner.nextInt();
                        scanner.nextLine();
                    System.out.println("\nDigite o ano de fabricação: ");
                        int portas = scanner.nextInt();
                        scanner.nextLine();
                    frota[cont].cadastrarCarro(placa, marca, modelo, anoFab, portas);
                    cont++;
                    break;
                case 2:
                    if(frota.length > 10){
                        System.out.println("\nNúmero de frotas chegou ao máximo");
                        return;
                    }
                    System.out.println("\nDigite a placa: ");
                        placa = scanner.nextLine();
                    System.out.println("\nDigite a marca: ");
                        marca = scanner.nextLine();
                    System.out.println("\nDigite o modelo: ");
                        modelo = scanner.nextLine();
                    System.out.println("\nDigite o ano de fabricação: ");
                        anoFab = scanner.nextInt();
                        scanner.nextLine();
                    System.out.println("\nDigite a carga máxima em toneladas: ");
                        int cargaM = scanner.nextInt();
                        scanner.nextLine();
                    System.out.println("\nDigite o número de eixos: ");
                        int eixos = scanner.nextInt();
                        scanner.nextLine();
                    frota[cont].cadastrarCaminhao(placa, marca, modelo, anoFab, cargaM, eixos);
                    cont++;
                    break;
                case 3:
                    System.out.println("\nDigite a placa: ");
                        placa = scanner.nextLine();
                    System.out.println("\nDigite a marca: ");
                        marca = scanner.nextLine();
                    System.out.println("\nDigite o modelo: ");
                        modelo = scanner.nextLine();
                    System.out.println("\nDigite o ano de fabricação: ");
                        anoFab = scanner.nextInt();
                        scanner.nextLine();
                    frota[cont].cadastrarVan(placa, marca, modelo, anoFab);
                    cont++;
                    break;
                case 4:
                    frota[cont].listarAlugaveis();
                    break;
                case 7:
                    frota[cont].listarFrota();
                    break;
                case 8:
                    frota[cont].listarCarro();
                    break;
                case 9:
                    frota[cont].listarCaminhao();
                    break;
                case 10:
                    frota[cont].listarVan();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa!");
                    break;
            }
        } while(opc!=0);
    }
}