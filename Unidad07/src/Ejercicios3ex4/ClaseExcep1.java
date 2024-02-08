package Ejercicios3ex4;
//Ejercicio 3 4
import java.util.Scanner;

public class ClaseExcep1 {

    public static void dividirEntreArray(int num, int[] datos) {
        for (int element : datos) {
            try {
                int resul = num / element;
                System.out.println(resul);
            } catch (ArithmeticException ae) {
                System.out.println(ae.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int numero = 2;
        int[] vector = {-2, -1 - 0, 1, 2};
        dividirEntreArray(numero, vector);
    }
}
