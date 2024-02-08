package Adivina;

public class Cuenta100 {

    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 100) {
            contador++;

            // Punto de ruptura cuando el contador es 64
            if (contador == 64) {
                System.out.println("Punto de ruptura alcanzado: contador = " + contador);
                break;
            }

            // Punto de ruptura cuando el breakpoint se ha ejecutado 57 veces
            if (contador % 3 == 0) {
                System.out.println("Punto de ruptura del breakpoint alcanzado: contador = " + contador);
                break;
            }

            
            System.out.println("Contador: " + contador);
        }
    }
}
