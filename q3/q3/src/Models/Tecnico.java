package Models;

public class Tecnico extends Funcionario {
    private String nivel;

    public Tecnico() {
    }

    public Tecnico(String codigo, String nome, double salario, String titulacao) {
        super(codigo, nome, salario);
        this.nivel = titulacao;
    }

    public String getTipo() {
        return "\nTécnico";
    }

    public void listarTecnico(Tecnico[] t) {
        for(Tecnico i : t) {
            if(i!=null) {
                System.out.println(i);
            }        }

    }

    public void listarFunciPorFaixaSalarial(Tecnico[] t, double faixaMenor, double faixaMaior) {
        for(Funcionario i : t) {
            if (i!= null && i.salario < faixaMaior && i.salario > faixaMenor) {
                System.out.println(i);
            }
        }
    }

    public String toString() {
        return "\nCódigo: " + this.codigo + "\nNome: " + this.nome + "\nSalário: R$" + this.salario + "\nNível: " + this.nivel;
    }
}

