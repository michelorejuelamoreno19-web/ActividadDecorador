public abstract class CafeBase implements Producto {
    protected String nombre;
    protected double precioBase;
    protected String tamano;
    protected String nivelTostado;

    public CafeBase(String nombre, double precioBase, String tamano, String nivelTostado) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tamano = tamano;
        this.nivelTostado = nivelTostado;
    }

    @Override
    public String nombre() {
        return nombre + " (" + tamano + ", tostado: " + nivelTostado + ")";
    }

    @Override
    public double precio() {
        return precioBase;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando base: " + nombre());
    }
}
