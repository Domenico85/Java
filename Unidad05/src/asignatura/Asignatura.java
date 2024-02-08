package asignatura;

/**
 *
 * @author DAM-DAW
 */
public class Asignatura {
    private String nombre;
    private int codigo;
    private String curso;
    public Asignatura(String nombre, int codigo, String curso){
        this.nombre=nombre;
        this.codigo=codigo;
        this.curso=curso;
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre (){
        return this.nombre; 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
