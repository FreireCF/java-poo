package Models;

public class Passagem {
    protected String nomePassageiro;
    protected double valorBase;

    public Passagem(String nome, double valor){
        this.nomePassageiro = nome;
        this.valorBase = valor;
    }

    public double calcularValor(){
        return valorBase;
    }

    public String toString(){
        return "\nNome: "
                +this.nomePassageiro
                +String.format("\nValor: R$ %.2f",calcularValor())
                +"\n";  
    }
}
