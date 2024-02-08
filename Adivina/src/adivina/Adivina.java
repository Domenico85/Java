package Adivina;

import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        int num_adiv = (int) (Math.random() * 100) + 1; // Que el número a adivinar esté entre 1 y 100
        int num_usu;
        int veces = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Dame un número entre 1 y 100:");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                sc.next(); // Limpiar el buffer del scanner
            }
            num_usu = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            veces++;

            if (num_usu < num_adiv) {
                System.out.println("El número buscado es mayor.");
            } else if (num_usu > num_adiv) {
                System.out.println("El número buscado es menor.");
            } else {
                System.out.println("¡Bravo, acertaste en " + veces + " intentos!");
            }
        } while (num_adiv != num_usu);

        sc.close(); // Cerrar el scanner al finalizar
    }
}
