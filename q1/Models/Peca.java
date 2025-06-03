package q1.Models;

public class Peca {
    protected String nome;
    protected float custo;
    protected float lucro;

    public Peca(){}

    public Peca(String nome, float custo, float lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getNome(){
        return nome;
    }

    public float getCusto(){
        return custo;
    }

    public float getLucro(){
        return lucro;
    }

    public void getNome(String nome){
        this.nome = nome;
    }

    public void getCusto(float custo){
        this.custo = custo;
    }

    public void getLucro(float lucro){
        this.lucro = lucro;
    }

    public float calcularPreco(){
        return lucro+custo;
    }

    public String exibir(){
        return "\nNome: "
                +nome
                +"\nCusto: R$"
                +String.format("%.2f", custo)
                +"\nLucro: R$"
                +String.format("%.2f", lucro)
                +"\n";
    }
}
