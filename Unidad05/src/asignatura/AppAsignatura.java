package asignatura;

public class AppAsignatura {

    public static void main(String[] args) {
        Asignatura as1 = new Asignatura("Mates", 1017, "1");
        System.out.println("codigo: " + as1.getCodigo());
        System.out.println("Nombre: " + as1.getNombre());
        System.out.println("Curso:" + as1.getCurso());
    }
}
