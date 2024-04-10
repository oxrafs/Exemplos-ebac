package rsilva.com.br.switchcase;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */

public class ExemploScanner1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua nome: ");
        String nome = s.nextLine();

        System.out.println("\nDigite sua altura: ");
        double altura = s.nextDouble();

        System.out.println("\n" + nome + " tem " + altura + " metro de altura");
    }
}
