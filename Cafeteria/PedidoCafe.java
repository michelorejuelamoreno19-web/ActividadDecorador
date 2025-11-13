import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoCafe implements Subject {
    private int idPedido;
    private Date fecha;
    private String metodoPago;
    private String estado;
    private List<Producto> bebidas = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();

    public PedidoCafe(int idPedido, String metodoPago) {
        this.idPedido = idPedido;
        this.fecha = new Date();
        this.metodoPago = metodoPago;
        this.estado = "Creado";
    }

    public void agregarBebida(Producto bebida) {
        bebidas.add(bebida);
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores("Pedido #" + idPedido + " ahora está: " + nuevoEstado);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : bebidas) total += p.precio();
        return total;
    }

    public void mostrarBebidas() {
        System.out.println("Pedido #" + idPedido + " - " + metodoPago + " - " + fecha);
        for (Producto p : bebidas)
            System.out.println("  • " + p.nombre() + " → $" + (int)p.precio());
    }

    // Métodos del patrón Observer
    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }
}
