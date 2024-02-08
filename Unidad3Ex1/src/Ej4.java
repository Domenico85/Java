
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.print(" Introduzca el primer numero real : ");
        double num1 = lector.nextDouble();

        System.out.print(" Introduzca el segundo numero real: ");
        double num2 = lector.nextDouble();

        lector.close();

        double min = Math.min(num1, num2);
        double max = Math.max(num1, num2);

        System.out.println(" Numeros de menor a mayor : " + min + ", " + max);
    }
}
