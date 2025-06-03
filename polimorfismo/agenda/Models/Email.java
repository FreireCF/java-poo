package Models;
import Models.*;

public class Email extends Contato {
    private String email;

    public Email(String email){
        super("email");
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void exibir(){
        System.out.println("\nTipo: "+getTipo());
        System.out.println("\n"+getEmail());
    }
}