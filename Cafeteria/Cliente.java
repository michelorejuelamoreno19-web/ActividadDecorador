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

    public void agregarPedido(PedidoCafe pedido) {
        pedidos.add(pedido);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de " + nombre + " (" + correo + ")");
        for (PedidoCafe p : pedidos) {
            System.out.println(p.getResumen());
            p.mostrarBebidas();
        }
    }

    public void contactar() {
        System.out.println("Enviando correo a " + correo);
    }

    public int contarPedidos() {
        return pedidos.size();
    }

    public List<PedidoCafe> getPedidos() {
        return new ArrayList<>(pedidos);
    }

    public String getNombre() {
        return nombre;
    }
}
