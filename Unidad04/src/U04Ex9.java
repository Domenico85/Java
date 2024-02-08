/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM-DAW
 */
public class U04Ex9 {

    public static double invertir(double a) {
        return 1 / a;
    }

    public static double media(double a, double b) {
        return (a + b) / 2;
    }

    public static double mediaArmonica(double a, double b) {
        double aInvert = invertir(a);
        double bInvert = invertir(b);
        double mitjana = media(aInvert, bInvert);
        return invertir(mitjana);
    }

    public static void main(String[] args) {
        double num1 = 45;
        double num2 = 23;
        System.out.println(" media armonica de " + num1 + " y " + num2 + " es " + mediaArmonica(num1, num2));

    }
}
