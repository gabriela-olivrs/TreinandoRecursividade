package treinando.recursividade;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entrada = in.next();
        verificaPalindromo(entrada);
    }

    private static void verificaPalindromo(String entrada) {

        if (checkPalindromo(entrada))
        {
            System.out.println("A palavra " + entrada + " é um palindromo");
        } else {
            System.out.println("A palavra " + entrada + " não é um palindromo");
        }
    }

    private static boolean checkPalindromo(String entrada) {
        if (entrada.length() == 1) {
            return true;
        }
        if (entrada.charAt(0) == entrada.charAt(entrada.length() - 1)) {

            return checkPalindromo(entrada.substring(1, entrada.length() - 1));
        }
        return false;
    }
}
