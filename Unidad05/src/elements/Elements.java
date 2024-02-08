package elements;

public class Elements {

    private String nombre;
    private int codigo;
    private static int totalElementos = 0;

    public Elements() {
        this.nombre = "trasto";
        totalElementos = totalElementos + 1;
        this.codigo = totalElementos;
    }

    public Elements(String nombre) {
        this.nombre = nombre;
        totalElementos = totalElementos + 1;
        this.codigo = totalElementos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return this.nombre;
    }

    public static int monstrarTotalElementos() {
        return totalElementos;
    }

    public void monstrarElemento() {
        System.out.println(" codigo: " + this.codigo + " nombre: " + this.nombre);
    }
}
