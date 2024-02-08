
import java.util.Scanner;

public class U06Ex2e2 {

    public static void main(String[] args) {

        String[] nombres = new String[6];
        Scanner lector = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(" Entra nombre ");
            nombres[i] = lector.nextLine();
        }
        System.out.println(" Posiciones Pares ");
        for (int i = 0; i < nombres.length; i += 2) {
            System.out.println(nombres[i]);

        }
        System.out.println("Posiciones pares ");
        for (int i = 1; i < nombres.length; i += 2) {
            System.out.println(nombres[i]);
        }
    }
}
