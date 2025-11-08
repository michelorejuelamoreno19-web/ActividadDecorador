import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    private List<PedidoCafe> pedidos = new ArrayList<>();

    public Cliente(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void agregarPedido(PedidoCafe pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado para " + nombre);
    }

    public void mostrarHistorial() {
        System.out.println("\n=== Historial de " + nombre + " ===");
        for (PedidoCafe p : pedidos) {
            p.mostrarBebidas();
        }
    }
}
