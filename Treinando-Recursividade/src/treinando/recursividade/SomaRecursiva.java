
package treinando.recursividade;

import java.util.Scanner;

public class SomaRecursiva {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        double n1 = in.nextDouble();
        System.out.println("Informe o segundo número:");
        double n2 = in.nextDouble();
        System.out.println(multiplicacao(n1, n2));
    }

    private static double multiplicacao(double n1, double n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        } else if (n1 == 1) {
            return n2;
        } else if (n2 == 1) {
            return n1;
        } else if (n2 < 0) {
            return -multiplicacao(n1, -n2);

        } else {
            return n1 + multiplicacao(n1, n2 - 1);
        }

    }
}
