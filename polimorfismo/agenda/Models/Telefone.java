package Models;
import Models.*;

public class Telefone extends Contato{
    private String telefone;

    public Telefone(String email){
        super("telefone");
        this.telefone = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void exibir(){
        System.out.println("\nTipo: "+ getTipo());
        System.out.println("\n"+ getTelefone());
    }
}