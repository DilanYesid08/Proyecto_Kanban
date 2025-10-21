public class TareaUrgente extends TareaBase {
    private int prioridad;

    public TareaUrgente(String nombre, String descripcion, String estado, int prioridad) {
        super(nombre, descripcion, estado);
        this.prioridad = prioridad;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tarea URGENTE: " + nombre + " | Prioridad: " + prioridad + " | Estado: " + estado);
    }
}