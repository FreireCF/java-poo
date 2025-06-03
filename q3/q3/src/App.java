import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import Models.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Departamento[] departamento = new Departamento[25];
        Funcionario[] docente = new Docente[100];
        Funcionario[] tecnico = new Tecnico[100];
        new Universidade("Teste", departamento);
        Menu menu = new Menu();

        //auxiliares para os contrutores
        String cod, nome;
        byte opc = 0;
        int contDep = 0, contDoce = 0, contTec = 0;
        double faixaMaior, faixaMenor;
        boolean encontrado = false;

        do {
            opc = menu.menu();
            switch (opc) {
                case 1:
                    if (contDep > 25) {
                        System.out.println("\nLimite de departamento atingido");
                    }
                        System.out.println("\nDigite o código do departamento: ");
                            cod = scanner.nextLine();
                        System.out.println("\nDigite o nome do departamento: ");
                            nome = scanner.nextLine();
                        departamento[contDep] = new Departamento(cod, nome);
                        contDep++;
                    break;
                case 2:
                    System.out.println("\nDigite o código do departamento que deseja cadastrar o funcionário: ");
                        cod = scanner.nextLine();
                    for (int i = 0; i < contDep; i++) {
                        if (departamento[i] != null && departamento[i].getCodigo().equalsIgnoreCase(cod)) {
                            departamento[i].adicionarFuncionarioTecnico();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nDepartamento não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nDigite o código do departamento que deseja cadastrar o funcionário: ");
                        cod = scanner.nextLine();
                    for (int i = 0; i < contDep; i++) {
                        if (departamento[i] != null && departamento[i].getCodigo().equalsIgnoreCase(cod)) {
                            departamento[i].adicionarFuncionarioDocente();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("\nDepartamento não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do departamento para busca: ");
                    String depBusca = scanner.nextLine();
                    for (Departamento i : departamento) {
                        i.buscarDepPorNome(departamento, depBusca);
                    }
                    break;
                case 5:
                    System.out.println("\nDigite o nome do funcionário para buscar: ");
                        nome = scanner.nextLine();
                    for (Departamento i : departamento) {
                        i.buscarFunciPorNome(nome);
                    }

                    break;
                case 6:
                    System.out.println("\nDigite o menor valor da faixa: ");
                    faixaMenor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("\nDigite o maior valor da faixa: ");
                    faixaMaior = scanner.nextDouble();
                    scanner.nextLine();
                    for (Departamento i : departamento) {
                        i.listarDepPorFuncionarioPorFaixaSalarial(departamento, faixaMaior, faixaMenor);
                    }
                    break;
                case 7:
                    System.out.println("\nDigite o menor valor da faixa: ");
                    faixaMenor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("\nDigite o maior valor da faixa: ");
                    faixaMaior = scanner.nextDouble();
                    scanner.nextLine();
                    for (Funcionario i : docente) {
                        i.listarFunciPorFaixaSalarial(docente, faixaMenor, faixaMaior);
                    }
                    for (Funcionario i : tecnico) {
                        i.listarFunciPorFaixaSalarial(tecnico, faixaMenor, faixaMaior);
                    }
                    break;
                case 8:
                    System.out.println("\nDigite o menor valor da faixa: ");
                    faixaMenor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("\nDigite o maior valor da faixa: ");
                    faixaMaior = scanner.nextDouble();
                    scanner.nextLine();
                    for (Departamento i : departamento) {
                        i.listarDepPorFaixaDeGasto(departamento, faixaMenor, faixaMaior);
                    }
                    break;
                case 9:
                    for (Departamento i : departamento) {
                        i.listarTodosOsFuncionario(departamento);
                    }
                    break;
                case 10:
                    for (Departamento i : departamento) {
                        i.listarTodosOsDep(departamento);
                    }
                    break;
                case 11:
                    for (Departamento i : departamento) {
                        i.listarDepEFunci(departamento);
                    }
                    break;
                case 12:
                    for (Funcionario i : docente) {
                        i.listarFuncionario(docente);
                    }
                    break;
                case 13:
                    for (Funcionario i : tecnico) {
                        i.listarFuncionario(tecnico);
                    }
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!");
                    break;
            }
        } while (opc != 0);
    }
}