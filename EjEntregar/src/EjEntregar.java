
import java.util.Scanner;

public class EjEntregar {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;

        int numero = 3;

        while (numero != 0) {
            
            numero = lector.nextInt();

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;

            }
        }

        System.out.println(positivos);

        System.out.println(negativos);

        // lector.close();
    }
}
