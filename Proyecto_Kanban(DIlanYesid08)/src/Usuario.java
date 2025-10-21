// Usuario.java
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Proyecto> proyectos; // asociación (un usuario puede tener varios proyectos)

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void agregarProyecto(Proyecto p) {
        if (p != null && !proyectos.contains(p)) {
            proyectos.add(p);
        }
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }
}
