package wilker.abstracao.mediaEscolar.Models;

public class Aluno {
    public String nome;
    public String matricula;
    public float n1, n2, t1, t2, media;

    public float calcularMedia(){
        media = ((n1 + n2 + t1 + t2)/4);
        return media;
    }
}
