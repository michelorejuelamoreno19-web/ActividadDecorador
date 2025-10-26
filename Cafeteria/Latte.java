public class Latte extends CafeBase {
    private double cantidadLeche;
    private boolean espumaLigera;
    private String tipoSabor;
    private boolean decoracionArte;

    public Latte() {
        super("Latte", 2.80, "Grande", 4);
        this.cantidadLeche = 200;
        this.espumaLigera = true;
        this.tipoSabor = "Vainilla";
        this.decoracionArte = true;
    }

    public void cambiarSabor(String sabor) {
        this.tipoSabor = sabor;
        System.out.println("Sabor del latte cambiado a: " + sabor);
    }

    public void agregarDecoracion() {
        this.decoracionArte = true;
        System.out.println("Se agregó decoración al latte.");
    }

    public void calentarLeche() {
        System.out.println("Calentando leche para el latte.");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando latte sabor " + tipoSabor);
    }
}
