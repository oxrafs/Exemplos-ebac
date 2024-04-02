package rsilva.com.br;

import java.util.Scanner;

/**
 * @author Rafael Silva
 */
public class Tarefa {

    public static void main(String args[]){

        int num1= 10;
        System.out.println("Tipo primitivo: " + num1);

        Integer num2 = Integer.valueOf(num1);
        System.out.println("Tipo wrapper: " + num2);
    }
}

//Exercio armazenar um valor na variavel do tipo primitivo e depois converter para wrapper