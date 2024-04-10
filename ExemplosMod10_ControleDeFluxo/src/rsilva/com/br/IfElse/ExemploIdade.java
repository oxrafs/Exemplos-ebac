package rsilva.com.br.IfElse;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */
public class ExemploIdade {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    private static String getIdade(int idade) {
        if (idade >= 0 && idade <= 5) {
            return "Voce é um bebe";
        } else if (idade >= 6 && idade <= 10) {
            return "Voce é uma criança";
        } else if (idade >= 10 && idade <= 18) {
            return "Voce é um adolescente";
        } else {
            return "Voce é um adulto";
        }
    }

}
