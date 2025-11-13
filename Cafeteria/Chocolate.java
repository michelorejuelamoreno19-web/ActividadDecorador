public class Chocolate extends DecoradorAdicional {
    private double porcentajeCacao;

    public Chocolate(Producto bebida) {
        super(bebida, 1000.0, "Chocolate");
        this.porcentajeCacao = 70.0;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Rallando chocolate (" + porcentajeCacao + "% cacao).");
    }
}
