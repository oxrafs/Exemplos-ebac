public class Operadores {

    private static Object operacaoAtribuicao;

    public static void main(String args[]){
        operadoresAritmeticas();
        operacoesAtribuicoes();
        operecaoesIncrementoDeCremento();
        operacoesRelacionais();
    }

    private static void operacoesRelacionais() {
        System.out.println("*****operacoesRelacionais*****");

        int num1 = 10;
        int num2 = 50;
        boolean isMaior = num2 > num1;
        System.out.println(isMaior);

        boolean isMenor = num1 < num2;
        System.out.println(isMenor);

        boolean isIgual = num1 == num2;
        System.out.println(isIgual);

        boolean isDiff = num1 != num2;
        System.out.println(isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println(isMaiorIgual);

        boolean isDentro10 = num1 >=1 && num2 <=10;
        System.out.println(isDentro10);
        //and

        boolean isDentro_10 = num1 >=1 || num2 <=10;
        System.out.println(isDentro_10);
        //or
    }

    private static void operecaoesIncrementoDeCremento() {
        System.out.println("*****operecaoesIncrementoDeCremento*****");

        int num1 = 10;
        System.out.println(num1);

        num1++;
        System.out.println(num1);
    }

    private static void operacoesAtribuicoes() {
        System.out.println("*****operacoesAtribuicoes*****");
        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        System.out.println(numero3);
    }


    public static void operadoresAritmeticas(){
        System.out.println("*****operadoresAritmeticas*****");
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10) / 2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);
    }
}
