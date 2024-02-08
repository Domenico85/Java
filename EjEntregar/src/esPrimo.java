
/**
 *
 * @author Dome
 */
public class esPrimo {

    public static boolean esPrimo(int numero) {
        boolean esPrimo;
        esPrimo = true;
        if (numero == 1) {
            esPrimo = false;
        } else {

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                }
            }
        }
        return esPrimo;
    }

    public static void main(String[] args) {
        int numero = 33;
        boolean result;
        result = esPrimo(numero);
        System.out.println(result);
    }
}
