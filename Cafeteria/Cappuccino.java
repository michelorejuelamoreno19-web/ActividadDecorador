// Subclase concreta que representa un cappuccino
public class Cappuccino extends CafeBase {
    private String tipoLeche;
    private int espumaCantidad;
    private String canela;

    public Cappuccino(String tipoLeche, int espumaCantidad, String canela) {
        super("Cappuccino", 4500, "Medio");
        this.tipoLeche = tipoLeche;
        this.espumaCantidad = espumaCantidad;
        this.canela = canela;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cappuccino con " + tipoLeche + ", " + espumaCantidad + "ml de espuma y canela " + canela);
    }

    public void agregarCanela() {
        System.out.println("Se añadió canela extra al cappuccino ✨");
    }
}
