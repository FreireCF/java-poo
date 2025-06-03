package Construtores.ExercicioFinal.Models;

public class ContaBancaria {
    private String numeroConta; //String para tratar casos de contas que começam com 0
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public ContaBancaria(String numeroConta, String nomeTitular){ //para casos q não informam o depInicial
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    //não criei um setNumeroConta pq não pode ser alterado após o uso no construtor

    public void setNomeTitular(String nomeTitular){ //o nome pode ser alterado em casos de casamento, por exemplo
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //também não criei um setDepositoInicial pelo mesmo motivo do número da conta

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        this.saldo -= valorSaque + 5; //o banco cobra R$ 5 de taxa por saque (faz o L)
    }

    public String toString(){
        return "\nDados da conta bancária: "
                + numeroConta
                + "\nTitular "
                + nomeTitular
                + " \nSaldo atual R$: "
                + String.format("%.2f", saldo);
    }
}