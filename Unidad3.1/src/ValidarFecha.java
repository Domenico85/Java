
import java.util.Scanner;

public class ValidarFecha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el d�a: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el a�o: ");
        int a�o = scanner.nextInt();

        if (esFechaValida(dia, mes, a�o)) {
            System.out.println("La fecha ingresada es v�lida.");
        } else {
            System.out.println("La fecha ingresada no es v�lida.");
        }
    }

    // M�todo para verificar si es una fecha v�lida
    public static boolean esFechaValida(int dia, int mes, int a�o) {
        // Verificar el rango del mes
        if (mes < 1 || mes > 12) {
            return false;
        }
        // Verificar el rango del d�a
        // Asumimos que el a�o puede ser cualquier valor positivo
        // Puedes agregar m�s validaciones seg�n tus requisitos

        return !(dia < 1 || dia > obtenerDiasEnMes(mes, a�o));
    }

    // M�todo para obtener la cantidad de d�as en un mes espec�fico
    public static int obtenerDiasEnMes(int mes, int a�o) {
        switch (mes) {
            case 2 -> {
                // Febrero
                // Verificar si el a�o es bisiesto
                if (a�o % 4 == 0 && (a�o % 100 != 0 || a�o % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case 4, 6, 9, 11 -> // Abril
            {
                // Noviembre
                return 30;
            }
            default -> // Junio
            {
                return 31;
            }
        }
        // Abril
        // Junio
        // Septiembre
    }
}
