package q2.Models;
import java.util.Arrays;

public class Admin extends Usuario {
    protected String[] permissoes;

    public Admin(String nome, String email, String[] permissoes){
        super(nome, email);
        this.permissoes=permissoes;
    }

    @Override
    public String toString(){
        return "\nNome: "
                +nome
                +"\nE-mail: "
                +email
                +"\nPermissões: "
                +Arrays.toString(permissoes);
    }


}
