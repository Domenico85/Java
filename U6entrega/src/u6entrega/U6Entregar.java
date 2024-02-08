package u6entrega;

public class U6Entregar {

    public static int maximoArray(int[] datos) {
        int max = datos[0];
        for (int elemento : datos) {
            if (elemento > max) {
                max = elemento;
            }

        }
        return max;
    }

    public static int minimoArray(int[] datos) {
        int min = datos[0];
        for (int elemento : datos) {
            if (elemento < min) {
                min = elemento;
            }
        }
        return min;
    }

    public static int sumaArray(int[] datos) {
        int suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma;
    }

    public static double mediaArray(int[] datos) {
        double media;
        media = /*(double)*/ sumaArray(datos) / datos.length;
        return media;
    }

    public static void main(String[] args) {
        int[] prueba = {2, -7, 5, 89, 789};
        System.out.println("El valor maximo es " + maximoArray(prueba));
        System.out.println("El valor minimo es " + minimoArray(prueba));
        System.out.println("El valor sumado es " + sumaArray(prueba));
        System.out.println("El valor de media es " + mediaArray(prueba));

    }
}
