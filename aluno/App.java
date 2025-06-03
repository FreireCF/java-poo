//package wilker.listaAbstracao.novaQ1;
//import java.util.Scanner;
//import wilker.listaAbstracao.novaQ1.Aluno;
//
//public class App {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Sistema sistema = new Sistema();
//        Aluno vetorAlunos[];
//        vetorAlunos = new Aluno[100];
//        String nome = "0";
//        float n1 = 0F, n2 = 0F;
//        byte opc = 0;
//
//        System.out.println("\nCadastro de alunos"); // LIMITAR PARA 100 ALUNOS !!!
//        for (int i = 0; i < 2; i++) {
//            System.out.println("\nDigite a matrícula do aluno " + (i + 1) + ": ");
//            matricula = scanner.nextLine();
//            System.out.println("\nDigite o nome do aluno: ");
//            nome = scanner.nextLine();
//            System.out.println("\nDigite a primeira nota: ");
//            n1 = scanner.nextFloat();
//            scanner.nextLine();
//            System.out.println("\nDigite a segunda nota: ");
//            n2 = scanner.nextFloat();
//            scanner.nextLine();
//            vetorAlunos[i] = new Aluno(nome, n1, n2);
//        }
//
//        System.out.println("\nDados dos alunos");
//        for (int i=0; i<2; i++) {
//            System.out.println("Aluno " + (i + 1) + ": ");
//            System.out.println("Matrícula: " + vetorAlunos[i].getMatricula());
//            System.out.println("Nome: "+vetorAlunos[i].getNome());
//            System.out.println("Nota do trabalho 1: ");
//            System.out.println("Nota do trabalho 2: ");
//            System.out.println("Nota da prova 1: ");
//        }
//    }
//}