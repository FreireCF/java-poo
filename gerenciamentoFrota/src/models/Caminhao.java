package models;

public class Caminhao extends Veiculo {
    double capacidadeCarga = 0F;
    int numEixos;

    public Caminhao(String placa, String marca, String modelo, int anoFab, double capacidadeCarga, int numEixos) {
        super(placa, marca, modelo, anoFab);
        this.capacidadeCarga = capacidadeCarga;
        this.numEixos = numEixos;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nCarro: ");
        System.out.println("\nPlaca: " + placa);
        System.out.println("\nMarca: " + marca);
        System.out.println("\nModelo: " + modelo);
        System.out.println("\nAno de fabricação: " + anoFab);
        System.out.println("\nCapacidade de carga (ton): " + capacidadeCarga);
        System.out.println("\nNúmero de eixos: " + numEixos);
    }
}