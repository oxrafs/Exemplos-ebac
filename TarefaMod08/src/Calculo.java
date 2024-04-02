public class Calculo {

    public static void main(String args[]) {
        calculo1();
    }

    private static void calculo1() {
        System.out.println("*****CALCULO E DIVISÃO*****");

        int num1 = 8390;
        int num2 = 150;
        int num3 = 210;
        int num4 = 365;

        int num5 = (num1 + num2 + num3 + num4) / 4;
        System.out.println("A média dos 4 números é: " + num5);
    }

}
