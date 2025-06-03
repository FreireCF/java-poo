package q2.Models;
import java.util.Arrays;

public class Professor extends Usuario {
    protected String[] disciplinas;

    public Professor(String nome, String email, String[] disciplinas){
        super(nome, email);
        this.disciplinas = disciplinas;
    }

    public String[] getDisciplinas(){
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas){
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString(){
        return "\nNome: "
                +nome
                +"\nE-mail: "
                +email
                +"\nDisciplinas ministradas: "
                + Arrays.toString(disciplinas);
    }
}
