
import java.util.Scanner;


public class Ej6 {
   public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cantidad en euros
        System.out.print("Ingrese la cantidad en euros: ");
        double cantidadEuros = scanner.nextDouble();

        // Calcular la cantidad mínima de monedas
        calcularMinimasMonedas(cantidadEuros);

        // Cerrar el objeto Scanner
        scanner.close();
    }

    private static void calcularMinimasMonedas(double cantidadEuros) {
        // Definir los valores de las monedas en euros
        double[] valoresMonedas = { 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };

        System.out.println("\nCantidad mínima de monedas:");

        // Iterar a través de los valores de las monedas
        for (double valorMoneda : valoresMonedas) {
            // Calcular la cantidad de monedas de este tipo
            int cantidadMonedas = (int) (cantidadEuros / valorMoneda);

            // Actualizar la cantidad de euros para el siguiente tipo de moneda
            cantidadEuros %= valorMoneda;

            // Imprimir el resultado si se necesitan monedas de este tipo
            if (cantidadMonedas > 0) {
                System.out.println(cantidadMonedas + " monedas de " + valorMoneda + " euros");
            }
        }
    }
}
