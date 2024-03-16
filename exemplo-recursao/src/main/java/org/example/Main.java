package org.example;

public class Main {
    public static int fatorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void contagemRegressiva(int n){
        for (int i = n; i >=0; i--) {
            System.out.println(i);
        }
    }

    public static void exibeVetor(int[] v, int i) {
        if (i < v.length) {
            System.out.println(v[i]);
            exibeVetor(v, i + 1);
        }
    }

    public static void exibeVetorInvertido(int[] v, int i) {
        if (i >= 0) {
            System.out.println(v[i]);
            exibeVetorInvertido(v, i - 1);
        }
    }

    public static void contagemRegressivaRecursiva(int n){
        if (n == 0){
            System.out.println(n);
        } else {
            System.out.println(n);
            contagemRegressivaRecursiva(n - 1);
        }
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Contagem regressiva do 5: ");
        contagemRegressiva(5);

        System.out.println("Contagem regressiva recursiva do 5: ");
        contagemRegressivaRecursiva(5);

        System.out.println("\nFatorial de 4 = " + fatorial(4));
        System.out.println("\nFatorial de 4 = " + fatorial(5));

        System.out.println("\nVetor");
        exibeVetor(vetor, 0);
        System.out.println("\nVetor Invertido");
        exibeVetorInvertido(vetor, vetor.length -1);
    }
}