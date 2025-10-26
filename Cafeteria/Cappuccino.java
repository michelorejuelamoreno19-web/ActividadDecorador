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

    // Getters / setters
    public double getEspumaCantidad() { return espumaCantidad; }
    public boolean hasCanela() { return canela; }
    public boolean hasCacao() { return cacao; }
    public String getTipoLeche() { return tipoLeche; }

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
    public String getDescripcion() {
        String extras = "";
        if (canela) extras += " + Canela";
        if (cacao) extras += " + Cacao";
        return super.getDescripcion() + extras + " - Leche: " + tipoLeche + " - Espuma: " + espumaCantidad + "ml";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cappuccino con " + espumaCantidad + "ml de espuma y leche " + tipoLeche);
        if (canela) System.out.println("Se añadirá canela.");
        if (cacao) System.out.println("Se añadirá cacao.");
    }
}
