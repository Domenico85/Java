/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Bucles {

    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        int factorial = 1;
        System.out.println(" Entra un numero");
        numero = lector.nextInt();
        for (int i = 1; i < numero; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

}
