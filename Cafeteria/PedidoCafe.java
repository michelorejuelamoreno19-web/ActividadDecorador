import java.util.ArrayList;
import java.util.List;

// Clase que representa un pedido de café con múltiples bebidas
public class PedidoCafe {
    private String idPedido;
    private String metodoPago;
    private List<Bebida> bebidas;

    public PedidoCafe(String idPedido, String metodoPago) {
        this.idPedido = idPedido;
        this.metodoPago = metodoPago;
        this.bebidas = new ArrayList<>();
    }

    public void agregarBebida(Bebida b) {
        bebidas.add(b);
    }

    public double calcularTotal() {
        double total = 0;
        for (Bebida b : bebidas) {
            total += b.getCosto();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("\n🧾 Pedido #" + idPedido + " - Pago: " + metodoPago);
        for (Bebida b : bebidas) {
            System.out.println("• " + b.getDescripcion() + " → $" + b.getCosto());
        }
        System.out.println("💰 Total: $" + calcularTotal());
    }
}
