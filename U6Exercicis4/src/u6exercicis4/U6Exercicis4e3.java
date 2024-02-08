package u6exercicis4;

public class U6Exercicis4e3 {

    public static void llenarDeImpares(int[] datos) {
        int impar = 1;
        for (int i = 0; i < datos.length; i++) {
            datos[i] = impar;
            impar += 2;
        }
    }

    public static void mostrarArrayPantalla2(int[] datos) {
        System.out.print("[");
        for (int i = 0; i < datos.length - 1; i++) {

            System.out.print(" " + datos[i] + ",");
        }
        System.out.println(" " + datos[datos.length - 1] + " ]");

    }

    public static String obtenirArrayComString(int[] datos) {
        String texto = "[";
        for (int i = 0; i < datos.length - 1; i++) {
            texto += " " + datos[i] + ",";
        }
        texto += " " + datos[datos.length - 1] + " ]  \n";
        return texto;
    }

    public static int obtenirSumaArray(int[] datos) {
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma;
    }

    public static int[] arrayPotencies2(int total) {
        int[] datos = new int[total];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int) Math.pow(2, i);
        }
        return datos;
    }

    public static void main(String[] args) {
        int[] prueba = new int[20];
        llenarDeImpares(prueba);
        mostrarArrayPantalla2(prueba);
        System.out.println(obtenirArrayComString(prueba));
        mostrarArrayPantalla2(arrayPotencies2(8));
        System.out.println("El valor sumado es " + obtenirSumaArray(prueba));
    }

}
