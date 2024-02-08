
import java.util.Random;


public class U06Ex2e1 {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random rd = new Random();
        
        for (int index = 0; index < numeros.length; index++) {
            numeros[index] = rd.nextInt(-50, 50);
        }
        for (int index = 0; index < numeros.length; index++) {
            System.out.println(" Index: " +index+ " numero: " + numeros[index]);
        }
        


        
    }

}
