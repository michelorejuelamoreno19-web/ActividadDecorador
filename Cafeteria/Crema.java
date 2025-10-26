public class Crema extends BebidaDecorador {
    private double volumen;
    private boolean batida;
    private String sabor;
    private double costo;

    public Crema(Bebida bebida) {
        super(bebida, "Crema", 1.00);
        this.volumen = 30.0;
        this.batida = false;
        this.sabor = "Vainilla";
        this.costo = 1.00;
    }

    public void batir() {
        this.batida = true;
        System.out.println("Crema batida");
    }

    public void ajustarVolumen(double ml) {
        this.volumen = ml;
        System.out.println("Volumen de crema ajustado a " + ml + "ml");
    }

    public void cambiarSabor(String s) {
        this.sabor = s;
        System.out.println("Sabor de crema cambiado a " + s);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando crema sabor " + sabor);
    }
}
