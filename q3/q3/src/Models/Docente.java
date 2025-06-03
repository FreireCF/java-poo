package Models;

public class Docente extends Funcionario {
    private String titulacao;

    public Docente(String codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.titulacao = titulacao;
    }

    public String getTipo() {
        return "\nDocente";
    }

    public void listarDocente(Docente[] f) {
        for(Docente i : f) {
            System.out.println(i);
        }

    }

    public void listarFunciPorFaixaSalarial(Docente[] f, double faixaMenor, double faixaMaior) {
        for(Funcionario i : f) {
            if (i.salario < faixaMaior && i.salario > faixaMenor) {
                if(i!=null) {
                    System.out.println(i);
                }            }
        }
    }

    public String toString() {
        return "\nCódigo: " + this.codigo + "\nNome: " + this.nome + "\nSalário: R$" + this.salario + "\nTitulação: " + this.titulacao;
    }
}
