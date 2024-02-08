package unidad07ejercicio2;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class U07Ex2_6 {

    public static char caracterEn(String text, int num) throws Exception {
        if (num >= 0 && num < text.length()) {
            return text.charAt(num);
        } else {
            Exception e = new Exception("No existeix la posicio en aquest String");
            throw e;
        }

    }

    public static void main(String[] args) {
        int pos = 2;
        char car;
        try {
            car = caracterEn("holaaaa", pos);
            System.out.println("El caracter de pos " + pos + "  es " + car);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
