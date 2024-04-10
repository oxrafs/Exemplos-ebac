package rsilva.com.br.switchcase;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt(); //aguarda eu digitar um valor do tipo int para dar continuidade
        System.out.println("Voce tem " + idade + " anos.50");
    }
}
