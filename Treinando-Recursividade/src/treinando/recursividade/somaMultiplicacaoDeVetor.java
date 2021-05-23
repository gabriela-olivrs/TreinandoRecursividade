package treinando.recursividade;

import java.util.Scanner;

public class somaMultiplicacaoDeVetor {

    public static void main(String[] args) {
        Scanner main = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = main.nextInt();
        int vector[] = new int[tamanho];
        preencheVector(vector);
        imprimeVector(vector);
        System.out.println("Digite 1 para soma dos elementos do vetor\nDigite 2 para multiplicacao dos elementos do vetor");
        int resp = main.nextInt();
        switch (resp) {
            case 1:
                System.out.println( somaVector(vector, 0));
                break;
            case 2:
                int resultdo = multiplicaVector(vector, 0);
                break;
            default:
                System.out.println("Entrada Inválida!");
                break;
        }
    }

    private static void imprimeVector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i]);

        }
        System.out.println("|");

    }

    public static void preencheVector(int[] vector) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = in.nextInt();
        }
    }

    public static int somaVector(int[] vector, int i) {

        if (i < vector.length) {
            return vector[i] + somaVector(vector, i + 1);

        } else {
            return 0;
        }
    }

    private static int multiplicaVector(int[] vector, int i) {
        if(i <vector.length )
          return vector[i] + multiplicaVector(vector, i + 1);            
        
        else
            return 0;

    
    
}
}
