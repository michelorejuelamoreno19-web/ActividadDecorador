public class Caramelo extends BebidaDecorador {
    private String tipo;
    private double densidad;
    private boolean jarabe;
    private double costo;

    public Caramelo(Bebida bebida) {
        super(bebida, "Caramelo", 1.20);
        this.tipo = "Dulce";
        this.densidad = 1.0;
        this.jarabe = true;
        this.costo = 1.20;
    }

    // Getters / setters
    public String getTipo() { return tipo; }
    public double getDensidad() { return densidad; }
    public boolean isJarabe() { return jarabe; }
    public double getCostoExtra() { return costo; }

    public void calentar() {
        System.out.println("Calentando caramelo...");
    }

    public void aplicar() {
        System.out.println("Aplicando caramelo sobre la bebida");
    }

    public void ajustarDensidad(double d) {
        this.densidad = d;
        System.out.println("Densidad del caramelo ajustada a " + d);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Caramelo(" + tipo + ", densidad " + densidad + ")";
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Aplicando caramelo tipo " + tipo + " (jarabe: " + jarabe + ")...");
    }
}
