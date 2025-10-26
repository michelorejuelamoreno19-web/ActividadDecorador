public class Leche extends BebidaDecorador {
    private String tipoLeche;
    private double temperatura;
    private boolean espumada;     // antes no usado
    private double cantidad;      // antes no usado (ml)

    public Leche(Bebida bebida, String tipoLeche) {
        super(bebida, "Leche(" + tipoLeche + ")", 0.80);
        this.tipoLeche = tipoLeche;
        this.temperatura = 65.0;
        this.espumada = false;
        this.cantidad = 100.0;
    }

    // Getters / setters
    public String getTipoLeche() { return tipoLeche; }
    public double getTemperatura() { return temperatura; }
    public boolean isEspumada() { return espumada; }
    public double getCantidad() { return cantidad; }

    public void espumar() {
        if (!espumada) {
            espumada = true;
            System.out.println("Leche espumada: " + tipoLeche);
        } else {
            System.out.println("La leche ya está espumada.");
        }
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
    public String getDescripcion() {
        // incluir información sobre si está espumada y la cantidad usada
        String esp = espumada ? " (espumada)" : "";
        return bebida.getDescripcion() + " + Leche(" + tipoLeche + ", " + (int)cantidad + "ml" + esp + ")";
    }

    @Override
    public void preparar() {
        super.preparar();
        // usar temperatura y cantidad en la preparación; mostrar si se espumaró
        System.out.println("Agregando " + (int)cantidad + "ml de leche " + tipoLeche + " a " + temperatura + "°C");
        if (espumada) {
            System.out.println("La leche está espumada -> listo para topping");
        } else {
            System.out.println("Leche no espumada. Si desea, llame a espumar().");
        }
    }
}
