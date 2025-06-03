//package wilker.listaAbstracao.novaQ1;
//import java.util.Scanner;
//
//public class Aluno {
//    //private String matricula;
//    private String nome;
//    private float n1=0F;
//    private float n2 =0F;
//    /*private float notaProva1=0F;
//    private float notaProva2=0F;*/
//
//    public Aluno(String nome, float n1, float n2) {
//        //this.matricula = matricula;
//        this.nome = nome;
//        this.n1 = n1;
//        this.n2 = n2;
//        //this.notaProva1 = notaProva1;
//        //this.notaProva2 = notaProva2;
//    }
//
//    /*public String getMatricula() {
//        return matricula;
//    }*/
//
//    public String getNome() {
//        return nome;
//    }
//
//    public double getN1() {
//        return n1;
//    }
//
//    public double getN2() {
//        return n2;
//    }
//
//    /*public double getNotaProva1() {
//        return notaProva1;
//    }
//
//    public double getNotaProva2() {
//        return notaProva2;
//    }
//
//    public void setMatricula(String matricula) {
//        this.matricula = matricula;*/
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public void setN1(float n1) {
//        this.n1 = n1;
//    }
//
//    public void setN2(float n2) {
//        this.n2 = n2;
//    }
//
//    /*public void setNotaProva1(float notaProva1) {
//        this.notaProva1 = notaProva1;
//    }
//
//    public void setNotaProva2(float notaProva2) {
//        this.notaProva2 = notaProva2;
//    }*/
//
//    public double calcularMedia() {
//        return (n1 + n2) / 2.0;
//    }
//
//    public boolean isAprovado() {
//        if(calcularMedia() >= 5){
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public byte Sistema(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("\n----------------MENU----------------");
//        System.out.println("\n| [0] - Encerrar programa           |");
//        System.out.println("\n| [1] - Cadastrar aluno  |");
//        System.out.println("\n| [2] - Listar alunos |");
//        System.out.println("\n| [3] - Buscar aluno|");
//        System.out.println("\n| [4] -  |");
//        System.out.println("\n------------------------------------");
//        System.out.println("\nDigite sua opção: ");
//            byte opc = scanner.nextByte();
//            scanner.nextLine();
//            return opc;
//            scanner.close();
//    }
//    public void executar(){
//
//}