// Decorador concreto que añade leche al café
public class Leche extends DecoradorAdicional {
    private String tipo;
    private boolean espumada;

    public Leche(Bebida bebida, String tipo, boolean espumada) {
        super(bebida, "Leche " + tipo, 800);
        this.tipo = tipo;
        this.espumada = espumada;
    }

    @Override
    public void preparar() {
        bebida.preparar();
        System.out.println("Añadiendo leche " + tipo + (espumada ? " espumada ☁️" : ""));
    }
}
