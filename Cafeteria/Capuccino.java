public class Capuccino extends CafeBase {
    private String tipoLeche;
    private int espumaCantidad;
    private String tipoCanela;

    public Capuccino(String tamano, String nivelTostado) {
        super("Capuccino", 3200.0, tamano, nivelTostado);
        this.tipoLeche = "Entera";
        this.espumaCantidad = 80;
        this.tipoCanela = "Regular";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Capuccino con leche " + tipoLeche +
                           ", espuma de " + espumaCantidad + "ml y toque de " + tipoCanela);
    }
}
