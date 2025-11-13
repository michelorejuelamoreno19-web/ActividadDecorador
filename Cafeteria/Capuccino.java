public class Capuccino extends CafeBase {
    public Capuccino(String tamano, String nivelTostado) {
        super("Capuccino", 3200.0, tamano, nivelTostado);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Capuccino (" + tamano + ", " + nivelTostado + ")...");
    }
}
