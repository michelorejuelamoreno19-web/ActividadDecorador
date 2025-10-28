// Subclase concreta que representa un café Latte
public class Latte extends CafeBase {
    private String tipoLeche;
    private int espumaLigera;
    private boolean arte;

    public Latte(String tipoLeche, int espumaLigera, boolean arte) {
        super("Latte", 4300, "Suave");
        this.tipoLeche = tipoLeche;
        this.espumaLigera = espumaLigera;
        this.arte = arte;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando latte con leche " + tipoLeche + " y espuma ligera de " + espumaLigera + "ml");
        if (arte) {
            System.out.println("Creando arte latte ☕🎨");
        }
    }
}
