package br.com.rsilva;

public class PrimeiraClasse {

    public static void main(String args []){
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Voce esta no ambiente dev");
        }
        else if (ambiente.equalsIgnoreCase("TEST")){
            System.out.print("Voce esta no ambiente de teste");
        }
        else {
            System.out.print(ambiente);
        }
    }
}
