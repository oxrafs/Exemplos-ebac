package rsilva.com.br.IfElse;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */

public class ExemploAnimal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = example0fiF(texto);
        System.out.println(animal);
    }

    public static String example0fiF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
