public abstract class BebidaDecorador implements Bebida {
    protected Bebida bebida;
    protected String nombreDecorador;
    protected double costoExtra;
    protected boolean agregadoActivo;

    public BebidaDecorador(Bebida bebida, String nombreDecorador, double costoExtra) {
        this.bebida = bebida;
        this.nombreDecorador = nombreDecorador;
        this.costoExtra = costoExtra;
        this.agregadoActivo = true;
    }

    protected String core() {
        return bebida.getDescripcion();
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + " + nombreDecorador;
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + costoExtra;
    }

    @Override
    public String getTamaño() {
        return bebida.getTamaño();
    }

    @Override
    public void preparar() {
        bebida.preparar();
        System.out.println("Agregando " + nombreDecorador);
    }
}
