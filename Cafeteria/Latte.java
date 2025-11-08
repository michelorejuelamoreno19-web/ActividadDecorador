public class Latte extends CafeBase {
    private int cantidadLeche;
    private String tipoSabor;
    private boolean espumaLigera;

    public Latte(String tamano, String nivelTostado) {
        super("Latte", 3000.0, tamano, nivelTostado);
        this.cantidadLeche = 150;
        this.tipoSabor = "Vainilla";
        this.espumaLigera = true;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Latte con " + cantidadLeche + "ml de leche y sabor " + tipoSabor);
    }
}
