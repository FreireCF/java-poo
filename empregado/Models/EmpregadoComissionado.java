package q1.Models;
import q1.Models.Empregado;

public class EmpregadoComissionado extends Empregado {
    protected double totalVendas;
    protected double percentualComissao;

    public EmpregadoComissionado(String nome, String cpf, double totalVendas, double percentualComissao) {
        super(nome, cpf);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularSalario() {
        return totalVendas * percentualComissao;
    }

    @Override
    public String toString() {
        return "\nNome: "
                + nome
                + "\nCPF: "
                + cpf
                + "\nTotal de vendas: "
                + totalVendas
                + "\nPercentual da comissão: "
                + percentualComissao
                +"%"
                +"\nSalário total: "
                +calcularSalario();
    }
}