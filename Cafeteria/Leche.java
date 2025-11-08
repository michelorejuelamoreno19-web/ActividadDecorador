public class Leche extends DecoradorAdicional {
    private String tipo;

    public Leche(Producto bebida) {
        super(bebida, 800.0, "Leche");
        this.tipo = "Entera";
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Añadiendo leche tipo: " + tipo);
    }
     public void servir() {
        System.out.println("Sirviendo " + nombre());
    }
}
