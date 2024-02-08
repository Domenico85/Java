package Adivina;

import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        int num_adiv = (int) (Math.random() * 100) + 1; // Que el n�mero a adivinar est� entre 1 y 100
        int num_usu;
        int veces = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dame un n�mero entre 1 y 100:");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingresa un n�mero v�lido.");
                sc.next(); // Limpiar el buffer del scanner
            }
            num_usu = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            veces++;

            if (num_usu < num_adiv) {
                System.out.println("El n�mero buscado es mayor.");
            } else if (num_usu > num_adiv) {
                System.out.println("El n�mero buscado es menor.");
            } else {
                System.out.println("�Bravo, acertaste en " + veces + " intentos!");
            }
        } while (num_adiv != num_usu);

        sc.close(); // Cerrar el scanner al finalizar
    }
}
