import java.util.ArrayList;
import java.util.List;

// Clase Cliente: contiene un historial de pedidos
public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    private List<PedidoCafe> historialPedidos;

    public Cliente(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.historialPedidos = new ArrayList<>();
    }

    public void agregarPedido(PedidoCafe pedido) {
        historialPedidos.add(pedido);
    }

    public void mostrarHistorial() {
        System.out.println("\n==============================================");
        System.out.println("👤 Cliente: " + nombre);
        System.out.println("📧 Correo: " + correo);
        System.out.println("📞 Teléfono: " + telefono);
        System.out.println("----------------------------------------------");
        for (PedidoCafe pedido : historialPedidos) {
            pedido.mostrarPedido();
        }
        System.out.println("==============================================\n");
    }
}
