public class Espresso extends CafeBase {
    private boolean dobleCarga;
    private String origen;
    private int segundosExtraccion;
    private boolean molidoFino;

    public Espresso() {
        super("Espresso", 1.80, "Pequeño", 7);
        this.dobleCarga = false;
        this.origen = "Colombia";
        this.segundosExtraccion = 25;
        this.molidoFino = true;
    }

    // Getters / setters (útiles y evitan warnings)
    public boolean isDobleCarga() { return dobleCarga; }
    public String getOrigen() { return origen; }
    public int getSegundosExtraccion() { return segundosExtraccion; }
    public boolean isMolidoFino() { return molidoFino; }

    public void servir() {
        System.out.println("Sirviendo un espresso con aroma intenso.");
    }

    public void configurarExtraccion(int segundos) {
        this.segundosExtraccion = segundos;
        System.out.println("Extracción configurada a " + segundos + "s");
    }

    public void activarDobleCarga() {
        this.dobleCarga = true;
        System.out.println("Doble carga activada");
    }

    @Override
    public String getDescripcion() {
        String extras = (dobleCarga ? " [Doble carga]" : "");
        String grind = molidoFino ? "molido fino" : "molido grueso";
        return super.getDescripcion() + extras + " - Origen: " + origen + " (" + grind + ")";
    }

    @Override
    public void preparar() {
        System.out.println("Extrayendo espresso de " + origen + " (" + segundosExtraccion + "s) - " + (molidoFino ? "molido fino" : "molido grueso"));
    }
}
