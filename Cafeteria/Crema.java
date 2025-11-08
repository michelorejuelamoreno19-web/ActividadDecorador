public class Crema extends DecoradorAdicional {
    private int cucharadas;

    public Crema(Producto bebida) {
        super(bebida, 1200.0, "Crema batida");
        this.cucharadas = 1;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo " + cucharadas + " cucharada(s) de crema.");
    }
     public void servir() {
        System.out.println("Sirviendo " + nombre());
    }
}
