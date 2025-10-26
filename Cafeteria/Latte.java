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

    // Getters / setters
    public double getCantidadLeche() { return cantidadLeche; }
    public boolean hasEspumaLigera() { return espumaLigera; }
    public String getTipoSabor() { return tipoSabor; }
    public boolean hasDecoracionArte() { return decoracionArte; }

    public void cambiarSabor(String sabor) {
        this.tipoSabor = sabor;
        System.out.println("Sabor del latte cambiado a: " + sabor);
    }

    public void agregarDecoracion() {
        this.decoracionArte = true;
        System.out.println("Se agregó decoración al latte.");
    }

    public void calentarLeche() {
        System.out.println("Calentando " + cantidadLeche + "ml de leche para el latte.");
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " - Sabor: " + tipoSabor + (decoracionArte ? " + Arte latte" : "") ;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando latte sabor " + tipoSabor + " con " + cantidadLeche + "ml de leche.");
    }
}
