package ejerciciosenclase;

import java.util.Scanner;

public class EjerciciosEnClase {

    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        boolean hay10 = false; //control de 10
        do {
            //System.out.println("Entra un numero");
            numero = lector.nextInt();
            if (numero == 10) {
                hay10 = true;
            }
        } while (numero != -1);

        if (hay10 == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

}
