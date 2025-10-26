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
        System.out.println("Cucharadas ajustadas a: " + nueva);
    }
}
