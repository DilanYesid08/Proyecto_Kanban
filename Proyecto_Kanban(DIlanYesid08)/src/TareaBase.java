public abstract class TareaBase {
    protected String nombre;
    protected String descripcion;
    protected String estado;

    public TareaBase(String nombre, String descripcion, String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public abstract void mostrarInfo();
}