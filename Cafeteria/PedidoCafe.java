import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoCafe {
    private int idPedido;
    private Date fecha;
    private String metodoPago;
    private List<Producto> bebidas = new ArrayList<>();

    public PedidoCafe(int idPedido, String metodoPago) {
        this.idPedido = idPedido;
        this.fecha = new Date();
        this.metodoPago = metodoPago;
    }

    public void agregarBebida(Producto bebida) {
        bebidas.add(bebida);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : bebidas) total += p.precio();
        return total;
    }

    public void mostrarBebidas() {
        System.out.println("Pedido #" + idPedido + " (" + metodoPago + ") - " + fecha);
        for (Producto p : bebidas)
            System.out.println("  • " + p.nombre() + " → $" + (int)p.precio());
        System.out.println("  Total: $" + (int)calcularTotal());
        System.out.println("-----------------------------------------");
    }
}
