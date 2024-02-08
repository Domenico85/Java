
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculadoraEdad {

    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Solicitar al usuario la fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento (formato: dd-MM-yyyy): ");
        String fechaNacimientoStr = scanner.next();

        // Convertir la cadena de fecha de nacimiento a un objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

        // Calcular la edad
        long edad = calcularEdad(fechaNacimiento, fechaActual);

        // Mostrar la edad
        System.out.println("Su edad es: " + edad + " años.");

        // Cerrar el objeto Scanner
        scanner.close();
    }

    private static long calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        // Calcular la diferencia en años
        return ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
    }
}
