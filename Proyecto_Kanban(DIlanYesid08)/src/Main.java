// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear usuarios y proyecto
        Usuario u1 = new Usuario("Yesid");
        Proyecto proyecto = new Proyecto("Proyecto Kanban - Corte 2");
        proyecto.setResponsable(u1);

        // Crear fechas
        FechaLimite f1 = new FechaLimite(21, 10, 2025);
        FechaLimite f2 = new FechaLimite(25, 10, 2025);

        // Crear tareas (herencia + polimorfismo)
        TareaNormal t1 = new TareaNormal("Diseñar UI", "Diseñar prototipo", f1);
        TareaUrgente t2 = new TareaUrgente("Corregir bug login", "Error al validar usuario", f2, 1);

        // Asociar responsable a tareas (opcional)
        t1.setResponsable(u1);
        t2.setResponsable(u1);

        // Agregar al proyecto (agregación)
        proyecto.agregarTarea(t1);
        proyecto.agregarTarea(t2);

        // Mostrar tareas
        proyecto.mostrarTareas();

        // Mover tarea de estado
        t1.moverTarea("En progreso");
        t2.moverTarea("Completada");

        System.out.println("\n--- Después de actualizar estados ---");
        proyecto.mostrarTareas();

        // Progreso
        System.out.printf("Progreso del proyecto: %.2f%%\n", proyecto.calcularProgreso());
    }
}
