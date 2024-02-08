import javax.swing.JOptionPane;

public class PidoNumero {

    public static void main(String[] args) {
        String texto = "";
        int numero = 0;
        
        while (numero <= 0 || numero >= 100) {
            texto = JOptionPane.showInputDialog("Dame un número");
            numero = Integer.parseInt(texto);

            // Punto de ruptura si el valor introducido es 9
            if (numero == 9) {
                System.out.println("Punto de ruptura alcanzado: el valor introducido es 9.");
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "El número introducido es " + texto);
    }
}

