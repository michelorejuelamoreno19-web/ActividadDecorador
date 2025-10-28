// Clase base abstracta para los diferentes tipos de café
public abstract class CafeBase implements Bebida {
    protected String nombre;
    protected double precioBase;
    protected String nivelTostado;

    public CafeBase(String nombre, double precioBase, String nivelTostado) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.nivelTostado = nivelTostado;
    }

    public String getDescripcion() {
        return nombre + " (Tostado: " + nivelTostado + ")";
    }

    public double getCosto() {
        return precioBase;
    }

    public abstract void preparar();
}
