// Decorador concreto que añade chocolate al café
public class Chocolate extends DecoradorAdicional {
    private int porcentajeCacao;
    private boolean amargo;

    public Chocolate(Bebida bebida, int porcentajeCacao, boolean amargo) {
        super(bebida, "Chocolate", 1000);
        this.porcentajeCacao = porcentajeCacao;
        this.amargo = amargo;
    }

    @Override
    public void preparar() {
        bebida.preparar();
        System.out.println("Añadiendo chocolate " + porcentajeCacao + "% cacao " + (amargo ? "amargo 🍫" : "dulce 🍩"));
    }
}
