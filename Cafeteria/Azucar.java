// Decorador concreto que añade azúcar al café
public class Azucar extends DecoradorAdicional {
    private int cucharadas;
    private boolean organica;

    public Azucar(Bebida bebida, int cucharadas, boolean organica) {
        super(bebida, "Azúcar", 300);
        this.cucharadas = cucharadas;
        this.organica = organica;
    }

    @Override
    public void preparar() {
        bebida.preparar();
        System.out.println("Agregando " + cucharadas + " cucharadas de azúcar " + (organica ? "orgánica 🍯" : ""));
    }
}
