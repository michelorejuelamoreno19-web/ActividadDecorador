public class Cappuccino extends CafeBase {
    private double espumaCantidad;
    private boolean canela;
    private boolean cacao;
    private String tipoLeche;

    public Cappuccino() {
        super("Cappuccino", 2.50, "Mediano", 5);
        this.espumaCantidad = 1.5;
        this.canela = true;
        this.cacao = false;
        this.tipoLeche = "Entera";
    }

    public void agregarCanela() {
        this.canela = true;
        System.out.println("Se agregó canela al cappuccino.");
    }

    public void agregarCacao() {
        this.cacao = true;
        System.out.println("Se agregó cacao al cappuccino.");
    }

    public void cambiarLeche(String tipo) {
        this.tipoLeche = tipo;
        System.out.println("Tipo de leche cambiado a: " + tipo);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cappuccino con espuma de " + tipoLeche);
    }
}
