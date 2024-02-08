
package exercicis3;

import java.util.Random;


public class U6Ex3e1 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][7];
        Random rd = new Random();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = rd.nextInt(20);
            }
        }
        System.out.println("La matriz completa:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println("");
        }
        System.out.println("La fila 5:");
        for (int columna = 0; columna < matriz[4].length; columna++) {
            System.out.print(matriz[4][columna] + "\t");
        }
        System.out.println("");
        System.out.println("El elemento de la cuarta fila tercera columna " + matriz[3][2]);
        System.out.println("El elemento de la quinta fila tercera columna " + matriz[4][2]);
        System.out.println("Intercabiar el contenido de estos dos elementos y visualizarlos de nuevo");
        int tmp = matriz[3][2];
        matriz[4][2] = tmp;
        System.out.println("La matriz completa despues de cambiar elementos");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println("");
        }
        System.out.println("La primera columna y la cuarta.");
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println(matriz[fila][0] + "\t\t\t" + matriz[fila][3]);
        }
        System.out.println("La primera columna y la cuarta.Intercambiar el contenido. Visualizarlo de nuevo");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println("");
        }

    }
}
