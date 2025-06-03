package Models;

public class Funcionario {
    protected String codigo;
    protected String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String codigo, String nome, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getTipo() {
        return "\n";
    }

    public void listarFunciPorFaixaSalarial(Funcionario[] f, double faixaMenor, double faixaMaior) {
        for(Funcionario i : f) {
            if (i!=null && i.salario < faixaMaior && i.salario > faixaMenor) {
                System.out.println(i);
            }
        }
    }

    public void listarFuncionario(Funcionario[] f) {
        for(Funcionario i : f) {
            if(i!=null) {
                System.out.println(i);
            }
        }
    }

    public String toString() {
        return "\nCódigo: " + this.codigo + "\nNome: " + this.nome + "\nSalário: R$" + this.salario;
    }
}
