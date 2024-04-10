package rsilva.com.br.IfElse;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */
public class ExemploPPT1_Console {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("\nDigite um número:");

        int result = s.nextInt();

        if (result == 1) {
            System.out.println("\nResultado igual à 1");
        } else if (result > 1) {
            System.out.println("\nResultado maior que 1");
        } else {
            System.out.println("\nResultado menor maior que 1");
        }

    }
}
