public abstract class DecoradorAdicional implements Producto {
    protected Producto bebida;
    protected double costoExtra;
    protected String nombreDecorador;
    protected boolean activo;

    public DecoradorAdicional(Producto bebida, double costoExtra, String nombreDecorador) {
        this.bebida = bebida;
        this.costoExtra = costoExtra;
        this.nombreDecorador = nombreDecorador;
        this.activo = true;
    }

    @Override
    public String nombre() {
        return bebida.nombre() + " + " + nombreDecorador;
    }

    @Override
    public double precio() {
        return bebida.precio() + (activo ? costoExtra : 0.0);
    }

    @Override
    public void preparar() {
        bebida.preparar();
        if (activo) {
            System.out.println("Agregando adicional: " + nombreDecorador + " ($" + (int)costoExtra + ")");
        }
    }

    public void activarDecorador(boolean estado) {
        this.activo = estado;
    }
}
