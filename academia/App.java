package wilker.abstracao.academia;
import wilker.abstracao.academia.Models.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
            aluno.nome = scanner.nextLine();

        System.out.println("\nDigite a idade do "+aluno.nome+": ");
            aluno.idade = scanner.nextDouble();
            scanner.nextLine();

        System.out.println("\nDigite o peso (em kgs) do "+aluno.nome+": ");
            aluno.peso = scanner.nextFloat();
            scanner.nextLine();

        System.out.println("\nDigite a altura (em m) do "+aluno.nome+": ");
            aluno.altura = scanner.nextFloat();
            scanner.nextLine();

        aluno.imc = aluno.calcularImc();

        System.out.println("\nDados do "+aluno.nome+": ");
        boolean ehMaior = aluno.maiorIdade();
        if(!ehMaior){
            System.out.println("\nAluno menor de idade");
        } else {
            System.out.println("\nAluno maior de idade");
        }
        System.out.println("Idade: "+aluno.idade+" anos");
        System.out.println("Peso: "+aluno.peso+"kgs");
        System.out.println("Altura: "+aluno.altura+"cm");
        System.out.println("IMC: "+aluno.imc);

        scanner.close();
    }
}
