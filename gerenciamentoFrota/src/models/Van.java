package models;

public class Van extends Veiculo implements Alugavel {

    public Van(String placa, String marca, String modelo, int anoFab){
        super(placa, marca, modelo, anoFab);
    }

    @Override
    public void exibirDados(){
        System.out.println("\nCarro: ");
        System.out.println("\nPlaca: "+placa);
        System.out.println("\nMarca: "+marca);
        System.out.println("\nModelo: "+modelo);
        System.out.println("\nAno de fabricação: "+anoFab);
    }

    public String getModelo(){
        return modelo;
    }

    @Override
    public int aluguelTresDias(){
        return 3*180;
    }

}
