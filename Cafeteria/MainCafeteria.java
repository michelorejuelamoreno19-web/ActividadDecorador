public class MainCafeteria {
    public static void main(String[] args) {
        // CLIENTE 1
        Cliente c1 = new Cliente("Ana", "ana@mail.com", "3001112222");
        PedidoCafe p1 = new PedidoCafe(1, "Efectivo");
        Producto b1 = new Espresso("Mediano", "Fuerte");
        b1 = new Leche(b1);
        b1 = new Crema(b1);
        p1.agregarBebida(b1);
        c1.agregarPedido(p1);

        // CLIENTE 2
        Cliente c2 = new Cliente("Juan", "juan@mail.com", "3003334444");
        PedidoCafe p2 = new PedidoCafe(2, "Tarjeta");
        Producto b2 = new Latte("Grande", "Medio");
        b2 = new Chocolate(b2);
        p2.agregarBebida(b2);
        c2.agregarPedido(p2);

        // CLIENTE 3
        Cliente c3 = new Cliente("Laura", "laura@mail.com", "3015556666");
        PedidoCafe p3 = new PedidoCafe(3, "Efectivo");
        Producto b3 = new Capuccino("Pequeño", "Suave");
        b3 = new Leche(b3);
        b3 = new Chocolate(b3);
        p3.agregarBebida(b3);
        c3.agregarPedido(p3);

        // CLIENTE 4
        Cliente c4 = new Cliente("Carlos", "carlos@mail.com", "3027778888");
        PedidoCafe p4 = new PedidoCafe(4, "Tarjeta");
        Producto b4 = new Latte("Mediano", "Fuerte");
        b4 = new Crema(new Chocolate(b4));
        p4.agregarBebida(b4);
        c4.agregarPedido(p4);

        // MOSTRAR HISTORIAL COMPLETO
        c1.mostrarHistorial();
        c2.mostrarHistorial();
        c3.mostrarHistorial();
        c4.mostrarHistorial();
    }
}
