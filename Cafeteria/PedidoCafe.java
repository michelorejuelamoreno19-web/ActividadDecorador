import java.util.ArrayList;
import java.util.List;

public class PedidoCafe {
    private String id;
    private List<Bebida> bebidas;
    private String fecha;
    private String metodoPago;

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
    }

    public String getResumen() {
        return "Pedido " + id + " (" + fecha + ") Total: $" + String.format("%.2f", calcularTotal());
    }

    public List<Bebida> getBebidas() {
        return new ArrayList<>(bebidas);
    }

    public String getId() {
        return id;
    }
}
