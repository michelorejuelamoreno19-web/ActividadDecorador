public class Azucar extends BebidaDecorador {
    private int cucharadas;
    private String tipoAzucar;
    private boolean disuelta;
    private boolean organica;

    public Azucar(Bebida bebida, int cucharadas) {
        super(bebida, "Azúcar", 0.20 * Math.max(0, cucharadas));
        this.cucharadas = Math.max(0, cucharadas);
        this.tipoAzucar = "Blanca";
        this.disuelta = false;
        this.organica = false;
    }

    // Getters / setters
    public int getCucharadas() { return cucharadas; }
    public String getTipoAzucar() { return tipoAzucar; }
    public boolean isDisuelta() { return disuelta; }
    public boolean isOrganica() { return organica; }

    public void endulzar() {
        disuelta = true;
        System.out.println("Endulzando con " + cucharadas + " cucharada(s) de " + tipoAzucar);
    }

    public void cambiarTipo(String tipo) {
        this.tipoAzucar = tipo;
        System.out.println("Tipo de azúcar cambiado a: " + tipo);
    }

    public void marcarOrganica(boolean valor) {
        this.organica = valor;
        System.out.println("Azúcar orgánica: " + valor);
    }

    public void ajustarCantidad(int nueva) {
        this.cucharadas = Math.max(0, nueva);
        this.costoExtra = 0.20 * this.cucharadas; // actualizar costo también
        System.out.println("Cucharadas ajustadas a: " + nueva);
    }

    @Override
    public String getDescripcion() {
        String org = organica ? " orgánica" : "";
        return bebida.getDescripcion() + " + Azúcar(" + cucharadas + ")" + org;
    }

    @Override
    public void preparar() {
        super.preparar();
        if (!disuelta) {
            System.out.println("Disolviendo azúcar (" + cucharadas + " cucharada(s))...");
            disuelta = true;
        } else {
            System.out.println("Azúcar ya disuelta.");
        }
    }
}
