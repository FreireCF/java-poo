package wilker.abstracao.mediaEscolar;
import wilker.abstracao.mediaEscolar.Models.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("\nDigite o nome do aluno: ");
            aluno.nome = scanner.nextLine();

        System.out.println("\nDigite a matrículo do "+aluno.nome+": ");
            aluno.matricula = scanner.nextLine();

        System.out.println("\nDigite a nota da primera prova: ");
            aluno.n1 = scanner.nextFloat();
            scanner.nextLine();

        System.out.println("\nDigite a nota da segunda prova: ");
            aluno.n2 = scanner.nextFloat();
            scanner.nextLine();

        System.out.println("\nDigite a nota do primero trabalho: ");
            aluno.t1 = scanner.nextFloat();
            scanner.nextLine();

        System.out.println("\nDigite a nota do primero trabalho: ");
            aluno.t2 = scanner.nextFloat();
            scanner.nextLine();

            aluno.media = aluno.calcularMedia();
            if(aluno.media>= 5){
                System.out.println("\nAluno aprovado! Média: "+aluno.media);
            } else {
                System.out.println("\nAluno reprovado! Média: "+aluno.media);
            }
            scanner.close();
    }
}