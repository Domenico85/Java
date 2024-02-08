
import java.util.Scanner;

public class ValidarFecha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha ingresada es válida.");
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }
    }

    // Método para verificar si es una fecha válida
    public static boolean esFechaValida(int dia, int mes, int año) {
        // Verificar el rango del mes
        if (mes < 1 || mes > 12) {
            return false;
        }
        // Verificar el rango del día
        // Asumimos que el año puede ser cualquier valor positivo
        // Puedes agregar más validaciones según tus requisitos

        return !(dia < 1 || dia > obtenerDiasEnMes(mes, año));
    }

    // Método para obtener la cantidad de días en un mes específico
    public static int obtenerDiasEnMes(int mes, int año) {
        switch (mes) {
            case 2 -> {
                // Febrero
                // Verificar si el año es bisiesto
                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
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
