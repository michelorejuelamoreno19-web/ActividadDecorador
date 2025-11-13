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
        // El cliente se suscribe a su pedido para recibir notificaciones
        pedido.agregarObservador(this);
        System.out.println("✅ Pedido agregado para " + nombre + " (Pedido #" + pedido.getIdPedido() + ")");
    }

    public void mostrarHistorial() {
        System.out.println("\n=== Historial de " + nombre + " (" + correo + ") ===");
        for (PedidoCafe p : pedidos) {
            p.mostrarBebidas();
        }
    }

    @Override
    public void actualizar(String mensaje) {
        // Aquí se imprime la notificación recibida
        System.out.println("🔔 Notificación para " + nombre + ": " + mensaje);
    }
}
