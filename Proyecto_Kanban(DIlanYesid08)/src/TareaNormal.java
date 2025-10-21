// TareaNormal.java
public class TareaNormal extends TareaBase {

    // Sobrecarga de constructores (polimorfismo por sobrecarga)
    public TareaNormal(String nombre) {
        this(nombre, "", null);
    }

    public TareaNormal(String nombre, String descripcion, FechaLimite fechaLimite) {
        super(nombre, descripcion, fechaLimite);
    }

    @Override
    public void moverTarea(String nuevoEstado) {
        // Podemos aplicar reglas específicas aquí si hace falta
        super.moverTarea(nuevoEstado);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("[NORMAL] ID:" + getId() + " | " + getNombre() + " | Estado: " + getEstado()
                + (getFechaLimite() != null ? " | Fecha: " + getFechaLimite() : ""));
    }
}
