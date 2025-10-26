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
    public void preparar() {
        System.out.println("Extrayendo espresso (" + segundosExtraccion + "s)...");
    }
}
