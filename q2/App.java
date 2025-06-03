package q2.Models;
import q2.Models.Models.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int contEst = 0, contNac = 0, contImp = 0;
        byte opc = 0;
        String nome, descricao;
        float valor;

        ProdutoEstadual[] estadual = new ProdutoEstadual[10];
        ProdutoNacional[] nacional = new ProdutoNacional[10];
        ProdutoImportado[] importado = new ProdutoImportado[10];
        Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("\n----------------MENU------------------");
                System.out.println("\n| [1] - CADASTRAR PRODUTO ESTADUAL   |");
                System.out.println("\n| [2] - CADASTRAR PRODUTO NACIONAL   |");
                System.out.println("\n| [3] - CADASTRAR PRODUTO IMPORTADO  |");
                System.out.println("\n| [4] - EXIBIR PRODUTOS ESTADUAIS    |");
                System.out.println("\n| [5] - EXIBIR PRODUTOS NACIONAIS    |");
                System.out.println("\n| [6] - EXIBIR PRODUTOS IMPORTADOS   |");
                System.out.println("\n| [7] - EXIBIR TODOS OS PRODUTOS     |");
                System.out.println("\n| [9] - SAIR                         |");
                System.out.println("\n--------------------------------------");
                opc = scanner.nextByte();
                scanner.nextLine();

                switch (opc) {
                    case 1:
                        if(contEst>10){
                            System.out.println("\nO estoque de produtos estaduais está cheio!");
                        } else {
                            System.out.println("\nDigite o nome do produto: ");
                            nome = scanner.nextLine();

                            System.out.println("\nInforme alguma descrição do produto: ");
                            descricao = scanner.nextLine();

                            System.out.println("\nDigite o valor: ");
                            valor = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println("\nO imposto para produtos estaduais é de 10% (automático)");

                            estadual[contEst] = new ProdutoEstadual(nome, descricao, valor, 10);
                            contEst++;
                        }
                        break;
                    case 2:
                        if(contNac>10){
                            System.out.println("\nO estoque de produtos nacionais está cheio!");
                        } else {
                            System.out.println("\nDigite o nome do produto: ");
                            nome = scanner.nextLine();

                            System.out.println("\nInforme alguma descrição do produto: ");
                            descricao = scanner.nextLine();

                            System.out.println("\nDigite o valor: ");
                            valor = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println("\nO imposto para produtos nacionais é de 10% e a taxa, 5%. (automáticos)");

                            nacional[contNac] = new ProdutoNacional(nome, descricao, valor, 10, 5);
                            contNac++;
                        }
                        break;
                    case 3:
                        if(contImp>10){
                            System.out.println("\nO estoque de produtos nacionais está cheio!");
                        } else {
                            System.out.println("\nDigite o nome do produto: ");
                            nome = scanner.nextLine();

                            System.out.println("\nInforme alguma descrição do produto: ");
                            descricao = scanner.nextLine();

                            System.out.println("\nDigite o valor: ");
                            valor = scanner.nextFloat();
                            scanner.nextLine();

                            System.out.println("\nO imposto para produtos importados é de 10%, a taxa é de 5% e a taxa de importação, 5%. (automáticos)");

                            nacional[contImp] = new ProdutoImportado(nome, descricao, valor, 10, 5, 5);
                            contImp++;
                        }
                        break;
                    case 4:
                        System.out.println("\nProdutos estaduais em estoque: ");
                        for( ProdutoEstadual i : estadual) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("\nProdutos nacionais em estoque: ");
                        for(ProdutoNacional i : nacional) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 6:
                        System.out.println("\nProdutos importados em estoque: ");
                        for(ProdutoImportado i : importado) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 7:
                        System.out.println("\nTodos os produtos em estoque: ");
                        System.out.println("\nEstaduais: ");
                        for( ProdutoEstadual i : estadual) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }

                        System.out.println("\nNacionais");
                        for(ProdutoNacional i : nacional) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }

                        System.out.println("\nImportados: ");
                        for(ProdutoImportado i : importado) {
                            if (i != null) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 9:
                        System.out.println("\nEncerrando o programa!");
                        break;
                    default:
                        System.out.println("\nOpção inválida. Tente novamente!");
                        opc = 0;
                }
            } while (opc != 9);
        }
    }