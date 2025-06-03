package q1.Models;

public class Empregado {
    protected String nome;
    protected String cpf;

    public Empregado(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public double calcularSalario(){
        return 0;
    }

    public String toString(){
        return "\nNome: "
                +nome
                +"\nCPF: "
                +cpf;
    }
}