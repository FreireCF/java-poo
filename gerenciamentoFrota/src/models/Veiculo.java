package models;

public abstract class Veiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anoFab;

    public Veiculo(){}

    public Veiculo(String placa, String marca, String modelo, int anoFab){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
    }

    public abstract void exibirDados();
}
