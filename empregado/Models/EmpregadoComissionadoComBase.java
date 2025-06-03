package q1.Models;

public class EmpregadoComissionadoComBase extends EmpregadoComissionado{
    private double salarioBase;

    public EmpregadoComissionadoComBase(String nome, String cpf, double totalVendas, double percentualComissao, double salarioBase){
        super(nome, cpf, totalVendas, percentualComissao);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario(){
        return totalVendas*percentualComissao+salarioBase;
    }

    @Override
    public String toString(){
        return "\nNome: "
                +nome
                +"\nCPF: "
                +cpf
                +"\nSalário base: "
                +salarioBase
                +"\nTotal de vendas: "
                +totalVendas
                +"\nPercentual de comissão: "
                +percentualComissao
                +"%"
                +"\nSalário tota: "
                +calcularSalario();
    }
}
