package rsilva.com.br;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */

public class Notas {

    public static void main(String[] args) {
        System.out.println("\n***CALCULO DA MÉDIA***");

        Scanner s = new Scanner(System.in);


        System.out.println("\nDigite a nota do 1º bimestre para calcular a média: ");
        int nota1 = s.nextInt();
        System.out.println("\nDigite a nota do 2º bimestre para calcular a média: ");
        int nota2 = s.nextInt();
        System.out.println("\nDigite a nota do 3º bimestre para calcular a média: ");
        int nota3 = s.nextInt();
        System.out.println("\nDigite a nota do 4º bimestre para calcular a média: ");
        int nota4 = s.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        String resultado = getMedia(media);
        System.out.println(resultado);
    }

    private static String getMedia(int media) {
        if (media >= 7) {
            return "\n***Voce foi aprovado***";
        } else if (media >= 5) {
            return "\n***Voce está de recuperação***";
        } else {
            return "\n***Voce esta reprovado***";
        }
    }
}
