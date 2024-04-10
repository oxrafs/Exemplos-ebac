package br.com.rsilva;

/**
 * @author Rafael Silva
 */

public class Exemplo1 {

    public static void main(String args[]) {

        //EXEMPLOS DE BOXING
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer idade = 10;

        Long cpf = 563215631L;

        //EXEMPLO DE UNBOXING
        boolean a = Boolean.TRUE;
        char letra = Character.valueOf('A');
        int idade2 = Integer.valueOf(12);
        long cpf4 = Long.valueOf(155745665);
    }
}
