public class TareaNormal extends TareaBase {

    public TareaNormal(String nombre, String descripcion, String estado) {
        super(nombre, descripcion, estado);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Tarea: " + nombre + " | Estado: " + estado);
    }
}