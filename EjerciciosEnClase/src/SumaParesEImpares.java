
import java.util.Scanner;

public class SumaParesEImpares {

    public static void main(String[] args) {
        int numero;
        //Scanner lector = new Scanner(System.in);
        //numero = lector.nextInt();
        int plus = 2;

        for (numero = 5; numero <= 1800; numero = numero + plus) {
            System.out.print(numero + " ");
            if (plus == 2) {
                plus = 3;
            } else {
                plus = 2;
            }

        }

    }

}
