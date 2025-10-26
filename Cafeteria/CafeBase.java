public abstract class CafeBase implements Bebida {
    protected String nombre;
    protected double precioBase;
    protected String tamaño;
    protected int nivelTostado;

    public CafeBase(String nombre, double precioBase, String tamaño, int nivelTostado) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tamaño = tamaño;
        this.nivelTostado = nivelTostado;
    }

    @Override
    public String getDescripcion() {
        return nombre + " (" + tamaño + ")";
    }

    @Override
    public double getCosto() {
        return precioBase;
    }

    @Override
    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando café base: " + nombre);
    }

    public void ajustarTostado(int nivel) {
        this.nivelTostado = nivel;
        System.out.println("Nivel de tostado ajustado a: " + nivel);
    }

    @Override
    public String toString() {
        return getDescripcion() + " -> $" + String.format("%.2f", getCosto());
    }
}
