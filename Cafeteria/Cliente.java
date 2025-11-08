import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private String telefono;
    private List<PedidoCafe> pedidos;

    public Cliente(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void agregarPedido(PedidoCafe pedido) {
        pedidos.add(pedido);
        System.out.println("✅ Pedido agregado para " + nombre);
    }

    public void mostrarHistorial() {
        System.out.println("\n📜 Historial de " + nombre + " (" + correo + "):");
        for (PedidoCafe p : pedidos) {
            p.mostrarBebidas();
            System.out.println("  Total: $" + (int)p.calcularTotal());
        }
    }
}
