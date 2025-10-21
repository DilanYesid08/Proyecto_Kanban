// Proyecto.java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Proyecto {
    private String nombre;
    private List<TareaBase> tareas;
    private Usuario responsable; // asociación

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setResponsable(Usuario responsable) {
        this.responsable = responsable;
        if (responsable != null) responsable.agregarProyecto(this);
    }

    public Usuario getResponsable() { return responsable; }

    public void agregarTarea(TareaBase tarea) {
        if (tarea == null) throw new IllegalArgumentException("La tarea no puede ser null");
        tareas.add(tarea);
    }

    public boolean eliminarTareaPorId(int id) {
        Iterator<TareaBase> it = tareas.iterator();
        while (it.hasNext()) {
            TareaBase t = it.next();
            if (t.getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public TareaBase buscarTareaPorId(int id) {
        for (TareaBase t : tareas) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public List<TareaBase> obtenerTareasPorEstado(String estado) {
        List<TareaBase> resultado = new ArrayList<>();
        for (TareaBase t : tareas) {
            if (t.getEstado().equalsIgnoreCase(estado)) resultado.add(t);
        }
        return resultado;
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas en el proyecto: " + nombre);
            return;
        }
        System.out.println("Tareas del proyecto: " + nombre);
        for (TareaBase t : tareas) {
            t.mostrarInfo();
        }
    }

    public double calcularProgreso() {
        if (tareas.isEmpty()) return 0.0;
        int completadas = 0;
        for (TareaBase t : tareas) {
            if ("Completada".equalsIgnoreCase(t.getEstado())) completadas++;
        }
        return (completadas * 100.0) / tareas.size();
    }

    public List<TareaBase> getTareas() {
        return new ArrayList<>(tareas); // devolvemos copia para encapsulamiento
    }
}
