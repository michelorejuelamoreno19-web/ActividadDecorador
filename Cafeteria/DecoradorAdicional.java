// Clase abstracta que permite agregar extras al café (Patrón Decorador)
public abstract class DecoradorAdicional implements Bebida {
    protected Bebida bebida;
    protected double costoExtra;
    protected String nombreDecorador;

    public DecoradorAdicional(Bebida bebida, String nombreDecorador, double costoExtra) {
        this.bebida = bebida;
        this.nombreDecorador = nombreDecorador;
        this.costoExtra = costoExtra;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + " + nombreDecorador;
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + costoExtra;
    }
}
