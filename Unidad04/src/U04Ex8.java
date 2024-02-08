
/**
 *
 * @author Dome
 */
public class U04Ex8 {

    public static void main(String[] args) {
        char caracter = 'a';
        int numeroLineas = 5;

        Triangulo(caracter, numeroLineas);
    }

    public static void Triangulo(char caracter, int numeroLineas) {
        for (int i = 1; i <= numeroLineas; i++) {

            for (int n = 1; n <= numeroLineas - i; n++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= i * 2 - 1; n++) {
                System.out.print(caracter);
            }

            System.out.println();
        }
    }
}
