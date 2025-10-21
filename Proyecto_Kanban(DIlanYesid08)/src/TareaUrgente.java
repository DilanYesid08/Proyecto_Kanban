// TareaUrgente.java
public class TareaUrgente extends TareaBase {
    private int prioridad; // 1 = Alta, 2 = Media, 3 = Baja

    public TareaUrgente(String nombre, int prioridad) {
        this(nombre, "", null, prioridad);
    }

    public TareaUrgente(String nombre, String descripcion, FechaLimite fechaLimite, int prioridad) {
        super(nombre, descripcion, fechaLimite);
        this.prioridad = prioridad;
    }

    public int getPrioridad() { return prioridad; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }

    @Override
    public void moverTarea(String nuevoEstado) {
        // Podrías forzar reglas: por ejemplo, bloquear completado si prioridad alta... aquí solo cambiamos.
        super.moverTarea(nuevoEstado);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[URGENTE] ID:" + getId() + " | " + getNombre() + " | Prioridad: " + prioridad
                + " | Estado: " + getEstado()
                + (getFechaLimite() != null ? " | Fecha: " + getFechaLimite() : ""));
    }
}
