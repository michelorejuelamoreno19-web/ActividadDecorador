import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// public class PedidoCafe implements Subject { ... }
public class PedidoCafe implements Subject {
    private int idPedido;
    private Date fecha;
    private String metodoPago;
    private String estado;
    private List<Producto> bebidas = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>(); // lista de observadores

    public PedidoCafe(int idPedido, String metodoPago) {
        this.idPedido = idPedido;
        this.fecha = new Date();
        this.metodoPago = metodoPago;
        this.estado = "Creado";
    }

    public void agregarBebida(Producto bebida) {
        bebidas.add(bebida);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : bebidas) {
            total += p.precio();
        }
        return total;
    }

    public void mostrarBebidas() {
        System.out.println("Pedido #" + idPedido + " - " + metodoPago + " - " + fecha);
        for (Producto p : bebidas) {
            System.out.println("  • " + p.nombre() + " → $" + (int)p.precio());
        }
    }

    // ---- Métodos del patrón Observer (implementación de Subject) ----
    @Override
    public void agregarObservador(Observer o) {
        if (o == null) return;
        if (!observadores.contains(o)) {
            observadores.add(o);
        }
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        // recorremos una copia por si un observador se elimina durante la notificación
        List<Observer> copia = new ArrayList<>(observadores);
        for (Observer o : copia) {
            o.actualizar(mensaje);
        }
    }

    // Cambiar estado y notificar
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // notificar a todos los observadores con un mensaje claro
        String mensaje = "Pedido #" + idPedido + " ahora está: " + nuevoEstado;
        notificarObservadores(mensaje);
    }

    public String getEstado() {
        return estado;
    }

    // getters
    public int getIdPedido() { return idPedido; }
    public Date getFecha() { return fecha; }
}
