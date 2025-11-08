public class Espresso extends CafeBase {
    private String origen;
    private String intensidad;
    private String metodoTostado;

    public Espresso(String tamano, String nivelTostado) {
        super("Espresso", 2500.0, tamano, nivelTostado);
        this.origen = "Colombia";
        this.intensidad = "Alta";
        this.metodoTostado = "Oscuro";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Espresso (" + metodoTostado + ") de " + origen);
    }

    public void activarDobleCarga() {
        this.precioBase += 800;
        System.out.println("Activada doble carga de espresso.");
    }
}
