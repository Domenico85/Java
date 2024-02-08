package Ejercicios3ex7i8;

public class Entrenament {

    public static void main(String[] args) {
        Corredor lucas = new Corredor(50);
        int contadorEx = 0;

        do {

            try {
                lucas.correr();
            } catch (AgotadoException ex) {
                contadorEx++;
                if (contadorEx == 1) {
                    lucas.recargarEnergia(30);
                } else if (contadorEx == 2) {
                    lucas.recargarEnergia(10);
                }

            }
        } while (contadorEx < 3);
    }

}
