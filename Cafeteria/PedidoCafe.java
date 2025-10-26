import java.util.ArrayList;
import java.util.List;

public class PedidoCafe {
    private String id;
    private List<Bebida> bebidas;
    private String fecha;
    private String metodoPago; // antes no usado

    public PedidoCafe(String id, String fecha, String metodoPago) {
        this.id = id;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.bebidas = new ArrayList<>();
    }

    public void agregarBebida(Bebida b) {
        bebidas.add(b);
    }

    public double calcularTotal() {
        double total = 0;
        for (Bebida b : bebidas) total += b.getCosto();
        return total;
    }

    public void mostrarBebidas() {
        for (Bebida b : bebidas) {
            System.out.println("- " + b.getDescripcion() + " -> $" + String.format("%.2f", b.getCosto()));
        }
        // Mostrar info del método de pago (uso explícito)
        System.out.println("Método de pago: " + (metodoPago != null && !metodoPago.isEmpty() ? metodoPago : "No especificado"));
    }

    public String getResumen() {
        // Incluir método de pago en el resumen para mostrar uso del atributo
        return "Pedido " + id + " (" + fecha + ") - Método pago: " + (metodoPago != null && !metodoPago.isEmpty() ? metodoPago : "No especificado")
                + " - Total: $" + String.format("%.2f", calcularTotal());
    }

    public List<Bebida> getBebidas() {
        return new ArrayList<>(bebidas);
    }

    public String getId() {
        return id;
    }

    // Getter y setter para el metodoPago (por si lo quieres cambiar después)
    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
}
