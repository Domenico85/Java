package metodos;

import java.util.Scanner;

/* Escriu un programa que calcule l'àrea i la longitud d'una circumferència en
funció del radi (llegit des de teclat). S'ha d'escriure un mètode per a
calcular l'àrea i un altre per a la longitud. Aquests mètodes rebran el radi
com a paràmetre. Les fórmules de l'àrea i la longitud d'una circumferència:
A= * r2
i L=2* * r */
public class Metodos {

    public static double area(double radi) {
        double resultado;
        resultado = Math.PI * Math.pow(radi, 2);
        return resultado;

    }

    public static double longitud(double radi) {
        return 2 * Math.PI * radi;

    }

    public static void main(String[] args) {

        double radio;
        Scanner lector = new Scanner(System.in);
        System.out.print(" Entra el radi: ");
        radio = lector.nextDouble();
        double calculArea = area(radio);
        System.out.println(" L Area es " + calculArea);

        System.out.println(" El perimetro es " + longitud(radio));
    }
}
