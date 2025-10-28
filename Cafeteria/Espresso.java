// Subclase concreta que representa un tipo de café específico
public class Espresso extends CafeBase {
    private String origen;
    private String intensidad;

    public Espresso(String origen, String intensidad) {
        super("Espresso", 4000, "Fuerte");
        this.origen = origen;
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando espresso con granos de " + origen + " e intensidad " + intensidad);
    }

    public void activarDobleCarga() {
        System.out.println("Se ha activado la doble carga del espresso ☕💪");
    }
}
