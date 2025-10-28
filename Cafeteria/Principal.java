public class Principal {
    public static void main(String[] args) {

        // Cliente 1
        Bebida cafe1 = new Espresso("Colombia", "Alta");
        cafe1 = new Leche(cafe1, "entera", true);
        cafe1 = new Azucar(cafe1, 2, true);

        PedidoCafe pedido1 = new PedidoCafe("001", "Efectivo");
        pedido1.agregarBebida(cafe1);

        Cliente cliente1 = new Cliente("Ana Torres", "ana@gmail.com", "3201112233");
        cliente1.agregarPedido(pedido1);

        // Cliente 2
        Bebida cafe2 = new Cappuccino("Deslactosada", 50, "en polvo");
        cafe2 = new Chocolate(cafe2, 70, false);

        PedidoCafe pedido2 = new PedidoCafe("002", "Tarjeta");
        pedido2.agregarBebida(cafe2);

        Cliente cliente2 = new Cliente("Luis Gómez", "luisg@hotmail.com", "3005558899");
        cliente2.agregarPedido(pedido2);

        // Cliente 3
        Bebida cafe3 = new Latte("Avena", 20, true);
        cafe3 = new Leche(cafe3, "avena", false);
        cafe3 = new Azucar(cafe3, 1, false);

        PedidoCafe pedido3 = new PedidoCafe("003", "Nequi");
        pedido3.agregarBebida(cafe3);

        Cliente cliente3 = new Cliente("Marta Díaz", "marta@gmail.com", "3109988776");
        cliente3.agregarPedido(pedido3);

        // Cliente 4
        Bebida cafe4 = new Espresso("Brasil", "Media");
        cafe4 = new Chocolate(cafe4, 80, true);
        cafe4 = new Leche(cafe4, "soya", true);

        PedidoCafe pedido4 = new PedidoCafe("004", "Efectivo");
        pedido4.agregarBebida(cafe4);

        Cliente cliente4 = new Cliente("Carlos López", "carlos@hotmail.com", "3154456777");
        cliente4.agregarPedido(pedido4);

        // Mostrar historial completo
        cliente1.mostrarHistorial();
        cliente2.mostrarHistorial();
        cliente3.mostrarHistorial();
        cliente4.mostrarHistorial();
    }
}
