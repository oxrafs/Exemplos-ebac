package rsilva.com.br.switchcase;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */

public class ExemploIdade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        String result;
        switch (idade) {
            case 0:
            case 5:
                result = "Voce é um bebe ";
                break;
            case 6:
            case 10:
                result = "Voce é uma criança ";
                break;
            case 11:
            case 18:
                result = "Voce é um adolescente. ";
                break;
            default:
                result = "Voce é um adulto";
                break;
        }
        return result;
    }

}
