package wilker.abstracao.academia.Models;

public class Aluno {
    public String nome;
    public double idade;
    public float peso = 0F;
    public float altura;
    public float imc;

    public boolean maiorIdade(){
        if(idade>18){
            return true;
        } else {
            return false;
        }
    }
    public float calcularImc(){
        imc = peso/(altura*altura);
        return imc;
    }
}
