package models;

public class Carro extends Veiculo implements Alugavel {
    public int numPortas;

    public Carro(){}

    public Carro(String placa, String marca, String modelo, int anoFab, int numPortas){
        super(placa, marca, modelo, anoFab);
        this.numPortas = numPortas;
    }

    public String getModelo(){
        return modelo;
    }

    @Override
    public void exibirDados(){
        System.out.println("\nCarro: ");
        System.out.println("\nPlaca: "+placa);
        System.out.println("\nMarca: "+marca);
        System.out.println("\nModelo: "+modelo);
        System.out.println("\nAno de fabricação: "+anoFab);
        System.out.println("\nNúmero de portas: "+numPortas);
    }

    @Override
    public int aluguelTresDias(){
        return 3*120;
    }
}