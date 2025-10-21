// FechaLimite.java
public class FechaLimite {
    private int dia;
    private int mes;
    private int anio;

    public FechaLimite(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
}
