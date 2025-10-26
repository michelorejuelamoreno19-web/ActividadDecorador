public class Leche extends BebidaDecorador {
    private String tipoLeche;
    private double temperatura;
    private boolean espumada;
    private double cantidad; // ml

    public Leche(Bebida bebida, String tipoLeche) {
        super(bebida, "Leche(" + tipoLeche + ")", 0.80);
        this.tipoLeche = tipoLeche;
        this.temperatura = 65.0;
        this.espumada = false;
        this.cantidad = 100.0;
    }

    public void espumar() {
        espumada = true;
        System.out.println("Leche espumada: " + tipoLeche);
    }

    public void calentar(double temp) {
        this.temperatura = temp;
        System.out.println("Leche calentada a " + temp + "°C");
    }

    public void medirCantidad(double ml) {
        this.cantidad = ml;
        System.out.println("Cantidad de leche ajustada a " + ml + "ml");
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando leche " + tipoLeche + " a " + temperatura + "°C");
    }
}
