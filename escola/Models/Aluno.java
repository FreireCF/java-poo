package q2.Models;

public class Aluno extends Usuario{
    protected String matricula;
    protected String curso;

    public Aluno(String nome, String email, String matricula, String curso){
        super(nome, email);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getCurso(){
        return curso;
    }

    @Override
    public String toString(){
        return "\nNome: "
                +nome
                +"\nE-mail: "
                +email
                +"\nMatrícula: "
                +matricula
                +"\nCurso: "
                +curso;
    }

}
