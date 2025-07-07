package Models;
import Models.*;

public class PassagemEstudante extends Passagem{
    public PassagemEstudante(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularValor(){
        return valorBase-(valorBase/100*50);
    }
}
