
import java.util.Scanner;

/**
 *
 * @author Dome
 */
public class Ej2 {

    public static void main(String args[]) {
        int edad;
        Scanner lector = new Scanner(System.in);
        System.out.println(" Edad: ");

        edad = lector.nextInt();
        if (edad >= 25) {
            System.out.println(" Tienes mas de 25 anyos ");
        } else if (edad < 25) {
            System.out.println(" Tienes menos de 25 anyos ");
        }
    }
}
