package unidad07ejercicio3;

import java.util.Scanner;

public class Unidad07Ejercicio3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String num1 = lector.nextLine();
        String num2 = lector.nextLine();
        try {
            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);
            int resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (NumberFormatException ne) {
            System.out.println("ERRORFORMAT");
        } catch (ArithmeticException ae) {
            System.out.println("ERRORDIV");
        }
    }

}
