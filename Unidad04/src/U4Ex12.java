
import java.util.Scanner;

public class U4Ex12 {

    public static void saludar(String nom, char opcio) {
        switch (opcio) {
            case 'a':
                System.out.println(" Bon dia, " + nom);
                break;
            case 'b':
                System.out.println(" Buenos dias, " + nom);
                break;
            case 'c':
                System.out.println(" Buongiorno," + nom);
                break;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        char caracter = lector.nextLine().charAt(0);

        saludar("Imma", caracter);
    }

}
