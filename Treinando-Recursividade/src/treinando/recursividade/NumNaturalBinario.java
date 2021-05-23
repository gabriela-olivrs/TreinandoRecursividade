
package treinando.recursividade;


public class NumNaturalBinario {

    public static void main(String[] args) {
        conversao(14);
    }

    private static void conversao(int numero) {
        if (numero > 0) {
            conversao(numero / 2);
            System.out.print(numero % 2);

        }
    }
}
