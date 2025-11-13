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
        // Notificar que se agregó una bebida y listar toppings
        String detalle = "Se agregó al pedido: " + extraerDescripcionCapas(bebida);
        notificarObservadores(detalle);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : bebidas) total += p.precio();
        return total;
    }

    public void mostrarBebidas() {
        System.out.println("Pedido #" + idPedido + " (" + metodoPago + ") - " + fecha);
        for (Producto p : bebidas) {
            System.out.println("  • " + p.nombre() + " → $" + (int)p.precio());
        }
        System.out.println("  Total: $" + (int) calcularTotal());
        System.out.println("-----------------------------------------");
    }

    // Prepara todas las bebidas y envía notificaciones por cada paso
    public void prepararPedido() {
        notificarObservadores("Inicio de preparación del Pedido #" + idPedido);
        for (Producto p : bebidas) {
            // notificar inicio preparación de esta bebida
            notificarObservadores("Preparando: " + p.nombre());
            // llamar a preparar de la bebida (esto imprime pasos internos)
            p.preparar();
            // notificar ingredientes extra (detalles ya mostrados por p.preparar, aquí extra mensaje)
            List<String> toppings = listarToppings(p);
            for (String t : toppings) {
                notificarObservadores("Ingrediente aplicado: " + t);
            }
            notificarObservadores("Bebida lista: " + p.nombre());
        }
        setEstado("Listo");
    }

    // Helper: extrae cadena descriptiva recorriendo capas (base + toppings)
    private String extraerDescripcionCapas(Producto p) {
        // Queremos base luego toppings en orden exterior->interior
        String descripcion = "";
        // Si es decorador, recorrer hasta la base para obtener nombre de base
        Producto actual = p;
        List<String> toppings = new ArrayList<>();
        while (actual instanceof DecoradorAdicional) {
            DecoradorAdicional da = (DecoradorAdicional) actual;
            toppings.add(da.getNombreDecorador());
            actual = da.getBebidaEnvuelta();
        }
        // ahora 'actual' es la base
        descripcion = actual.nombre();
        // agregar toppings (en orden interno->externo)
        for (int i = toppings.size() - 1; i >= 0; i--) {
            descripcion += " + " + toppings.get(i);
        }
        return descripcion;
    }

    // Helper: lista toppings como strings
    private List<String> listarToppings(Producto p) {
        List<String> toppings = new ArrayList<>();
        Producto actual = p;
        while (actual instanceof DecoradorAdicional) {
            DecoradorAdicional da = (DecoradorAdicional) actual;
            toppings.add(da.getNombreDecorador());
            actual = da.getBebidaEnvuelta();
        }
        // toppings is outer->inner; reverse to show base->outer if desired
        List<String> resultado = new ArrayList<>();
        for (int i = toppings.size() - 1; i >= 0; i--) {
            resultado.add(toppings.get(i));
        }
        return resultado;
    }

    // ---- Observer methods ----
    @Override
    public void agregarObservador(Observer o) {
        if (o == null) return;
        if (!observadores.contains(o)) observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores(String mensaje) {
        for (Observer o : new ArrayList<>(observadores)) {
            o.actualizar(mensaje);
        }
    }

    // cambiar estado y notificar
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarObservadores("Pedido #" + idPedido + " ahora está: " + nuevoEstado);
    }

    public String getEstado() {
        return estado;
    }

    // getters
    public int getIdPedido() { return idPedido; }
}
