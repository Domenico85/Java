/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Dome
 */
public class Ex1 {
    
    public static void main (String args []) {
        int edad ;
        Scanner lector = new Scanner (System.in);
        System.out.println(" Edad: ");
        
        edad = lector.nextInt();
        if (edad >= 18) {
            System.out.println(" Eres mayor de edad");
        } else if (edad <18) {
    System.out.println(" Eres menor de edad ");
        }
    }
}
