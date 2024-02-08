
import java.util.Random;

public class U06Ex2e3 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random rd = new Random();
        for (int index = 0; index < numeros.length; index++) {
            numeros[index] = rd.nextInt(-50, 50);
        }
        for (int index = 0; index < numeros.length; index ++) {
           
            System.out.print( numeros[index]+"\t");
             if ((index+1) %4==0)
                 System.out.println("");
        }
    }
}
