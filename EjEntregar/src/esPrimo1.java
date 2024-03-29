
public class esPrimo1 {

    /**
     *
     * @param numero
     * @return
     */
    public static boolean esPrimo1(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero = 33;
        boolean result;
        result = esPrimo1(numero);
        System.out.println(result);
    }
}
