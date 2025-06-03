package Models;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Departamento {
    Scanner scanner = new Scanner(System.in);
    protected String codigo;
    protected String nome;
    protected Funcionario[] funcionarios;
    protected int contFuncionarios;

    public Departamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new Funcionario[100];
        this.contFuncionarios = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getGastoTotal(Departamento[] d) {
        double gastoTotal = 0f;

        for(Departamento i : d) {
            for(Funcionario j : i.funcionarios) {
                gastoTotal += j.getSalario();
            }
        }
        return gastoTotal;
    }

    public void adicionarFuncionarioDocente() {
        System.out.println("\nDigite o código do funcionário: ");
        String cod = scanner.nextLine();
        System.out.println("\nDigite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("\nDigite o salario do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\n{Digite a titulação do funcionário: ");
        String titulacao = scanner.nextLine();

        this.funcionarios[contFuncionarios] = new Docente(cod, nome, salario, titulacao);
        contFuncionarios++;
    }

    public void adicionarFuncionarioTecnico() {
        System.out.println("\nDigite o código do funcionário: ");
        String cod = this.scanner.nextLine();
        System.out.println("\nDigite o nome do funcionário: ");
        String nome = this.scanner.nextLine();
        System.out.println("\nDigite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("\nDigite o nível do funcionário: ");
        String nivel = scanner.nextLine();

        this.funcionarios[contFuncionarios] = new Tecnico(cod, nome, salario, nivel);
        contFuncionarios++;
    }

    public void buscarDepPorNome(Departamento[] dep, String nome) {
        for(Departamento i : dep) {
            if (Objects.equals(i.nome.toUpperCase(), nome.toUpperCase(Locale.ROOT))) {
                System.out.println("\nDepartamento encontrado!");
                System.out.println(i);;
            } else {
                System.out.println("\nDepartamento não cadastraado!");
            }
        }
    }

    public void buscarFunciPorNome(String cod) {
        for(Funcionario i : funcionarios) {
            if (Objects.equals(i.codigo, cod)) {
                System.out.println(i);
            }
        }
    }

    public void listarDepPorFuncionarioPorFaixaSalarial(Departamento[] dep, double faixaMaior, double faixaMenor) {
        for(Departamento i : dep) {
            for(Funcionario f : i.funcionarios) {
                if (f!=null && f.salario > faixaMenor && f.salario < faixaMaior) {
                    System.out.println(f);
                }
            }
        }
    }

    public void listarDepPorFaixaDeGasto(Departamento[] dep, double faixaMenor, double faixaMaior) {
        for(Departamento d : dep) {
                if (d!=null && d.getGastoTotal(dep) > faixaMenor && d.getGastoTotal(dep) < faixaMaior) {
                    System.out.println(dep);
            }
        }
    }

    public void listarTodosOsFuncionario(Departamento[] dep) {
        for(Departamento i : dep) {
            if(i!=null && i.funcionarios!=null){
            for(Funcionario j : i.funcionarios) {
                if (j != null) {
                    System.out.println(j);
                    }
                }
            }
        }
    }

    public void listarTodosOsDep(Departamento[] dep) {
        for(Departamento i : dep) {
            if(i!=null) {
                System.out.println(i);
            }
        }
    }

    public void listarDepEFunci(Departamento[] dep) {
        for(Departamento i : dep) {
            if(i!=null) {
                System.out.println(i);
            }
            for(Funcionario j : i.funcionarios) {
                if(j!=null) {
                    System.out.println(j);
                }
            }
        }
    }
}