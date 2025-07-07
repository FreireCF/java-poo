package models;

public class Utilidade {
    public static float soma=0;
    public static float maior=-9999;
    public static float menor=9999;

    public static float media(float[] vet) { // calcula e retorna a media dos elementos do vetor
        for(int i=0; i<vet.length; i++){
            soma += vet[i];
        }
        return soma/vet.length;
    }

    public static float soma(float[] vet) { // calcula e retorna a soma dos elementos do vetor
        for(int i=0; i<vet.length; i++){
            soma += vet[i];
        }
        return soma;
    }

    public static float maior(float[] vet) {// retorna o maior valor encontrado no vetor
        for(int i=0; i<vet.length; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }
        return maior;
    }

    public static float menor(float[] vet) { // retorna o menor valor encontrado no vetor
        for(int i=0; i<vet.length; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
    }

    public static int max(int A, int B) { // retorna o maior entre A e B
        if (A > B){
            return A;
        } else if (A < B) {
            return B;
        }
        return 0;
    }
}