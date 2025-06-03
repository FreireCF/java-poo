package q2;
import q2.Models.*;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nome", "nome@gmail.com");

        String[] permissoesAdm = {"banir", "ver informações", "adicionar"};
        Admin adm = new Admin("adm", "adm@gmail.com", permissoesAdm);

        String[] disciplinasProf = {"estrutura de dados", "POO", "Banco de dados"};
        Professor prof = new Professor("Luís", "luis@gmail.com", disciplinasProf);

        Aluno aluno = new Aluno("Clecio", "clecio@gmail.com", "105020241", "Ciência da computação");

        System.out.printf(String.valueOf(usuario));
        System.out.println(adm);
        System.out.println(prof);
        System.out.println(aluno);

    }
}
