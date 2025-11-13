import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observer {
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
        pedido.agregarObservador(this); // 👈 El cliente observa su pedido
        System.out.println("Pedido agregado para " + nombre);
    }

    public void mostrarHistorial() {
        System.out.println("\nHistorial de " + nombre + ":");
        for (PedidoCafe p : pedidos) {
            p.mostrarBebidas();
            System.out.println("  Total: $" + (int)p.calcularTotal());
        }
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("🔔 Notificación para " + nombre + ": " + mensaje);
    }
}
