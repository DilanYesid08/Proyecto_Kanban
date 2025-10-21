// TareaBase.java
import java.util.concurrent.atomic.AtomicInteger;

public abstract class TareaBase implements Movible {
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    private final int id;
    private String nombre;
    private String descripcion;
    private String estado; // "Pendiente", "En progreso", "Completada"
    private FechaLimite fechaLimite; // composición
    private Usuario responsable; // asociación opcional

    public TareaBase(String nombre, String descripcion, FechaLimite fechaLimite) {
        this.id = COUNTER.getAndIncrement();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = "Pendiente";
        this.fechaLimite = fechaLimite;
    }

    // Getter básicos
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getEstado() { return estado; }
    public FechaLimite getFechaLimite() { return fechaLimite; }
    public Usuario getResponsable() { return responsable; }

    // Setters (encapsulamiento)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setFechaLimite(FechaLimite fechaLimite) { this.fechaLimite = fechaLimite; }
    public void setResponsable(Usuario responsable) { this.responsable = responsable; }

    // Interfaz Movible: comportamiento por defecto
    @Override
    public void moverTarea(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Para que cada subclase muestre su info (polimorfismo)
    public abstract void mostrarInfo();
}
