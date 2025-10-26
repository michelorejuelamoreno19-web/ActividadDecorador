public class Chocolate extends BebidaDecorador {
    private String tipo;
    private double porcentajeCacao;
    private boolean derretido;
    private boolean amargo;

    public Chocolate(Bebida bebida, String tipo) {
        super(bebida, "Chocolate(" + tipo + ")", 1.50);
        this.tipo = tipo;
        this.porcentajeCacao = 70.0;
        this.derretido = false;
        this.amargo = true;
    }

    // Getters / setters
    public String getTipo() { return tipo; }
    public double getPorcentajeCacao() { return porcentajeCacao; }
    public boolean isDerretido() { return derretido; }
    public boolean isAmargo() { return amargo; }

    public void derretir() {
        derretido = true;
        System.out.println("Derretiendo chocolate tipo: " + tipo);
    }

    public void cambiarPorcentaje(double p) {
        this.porcentajeCacao = p;
        System.out.println("Porcentaje de cacao ajustado a: " + p + "%");
    }

    public void hacerDulce() {
        this.amargo = false;
        System.out.println("Chocolate hecho dulce");
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Chocolate(" + tipo + ", " + porcentajeCacao + "% cacao" + (amargo ? ", amargo" : ", dulce") + ")";
    }

    @Override
    public void preparar() {
        super.preparar();
        if (!derretido) {
            System.out.println("Derritiéndose " + tipo + " (" + porcentajeCacao + "%)...");
            derretido = true;
        } else {
            System.out.println("Chocolate ya derretido.");
        }
    }
}
