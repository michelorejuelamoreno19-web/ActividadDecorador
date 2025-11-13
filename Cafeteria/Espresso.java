public class Espresso extends CafeBase {
    public Espresso(String tamano, String nivelTostado) {
        super("Espresso", 2500.0, tamano, nivelTostado);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Espresso (" + tamano + ", " + nivelTostado + ")...");
    }
}
