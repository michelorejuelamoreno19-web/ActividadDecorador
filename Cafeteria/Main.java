public class Main {
    public static void main(String[] args) {
        // ----------------------------
        // CLIENTE 1: Ana Pérez
        // - Pedido A001: Espresso simple + Latte con leche de almendra y 1 azúcar
        // ----------------------------
        Cliente cliente1 = new Cliente("Ana Perez", "ana.perez@mail.com", "3001000100");
        PedidoCafe pedidoA1 = new PedidoCafe("A001", "2025-10-24", "Efectivo");

        // Espresso simple
        Bebida espressoSimple = new Espresso();
        // preparar y servir el espresso
        espressoSimple.preparar();
        pedidoA1.agregarBebida(espressoSimple);

        // Latte personalizado: leche almendra (medir cantidad y espumar) + 1 azúcar
        Latte latte = new Latte();
        Leche lecheAlmendra = new Leche(latte, "Almendra");
        lecheAlmendra.medirCantidad(150);    // usar atributo cantidad
        lecheAlmendra.espumar();             // usar atributo espumada
        Azucar latteAzucar = new Azucar(lecheAlmendra, 1);
        // preparar componentes
        latteAzucar.preparar();
        pedidoA1.agregarBebida(latteAzucar);

        // Añadir pedido al cliente
        cliente1.agregarPedido(pedidoA1);

        // ----------------------------
        // CLIENTE 2: Carlos Gómez
        // - Pedido C001: Cappuccino con 2 azúcar + chocolate oscuro + crema
        // ----------------------------
        Cliente cliente2 = new Cliente("Carlos Gomez", "carlos.g@mail.com", "3002000200");
        PedidoCafe pedidoC1 = new PedidoCafe("C001", "2025-10-24", "Tarjeta");

        Cappuccino capp = new Cappuccino();
        // personalizar cappuccino: cambiar leche y añadir extras
        capp.cambiarLeche("Entera");
        Azucar cappAzucar = new Azucar(capp, 2);
        Chocolate cappChoco = new Chocolate(cappAzucar, "Oscuro");
        Crema cappChocoCrema = new Crema(cappChoco);
        // acciones de los decoradores
        cappChoco.derretir();
        cappChocoCrema.batir();
        cappChocoCrema.ajustarVolumen(40);
        // preparar y agregar
        cappChocoCrema.preparar();
        pedidoC1.agregarBebida(cappChocoCrema);

        cliente2.agregarPedido(pedidoC1);

        // ----------------------------
        // CLIENTE 3: Daniela Ruiz
        // - Pedido D001: Espresso doble (activarDobleCarga, configurarExtraccion) con Leche+Crema+Caramelo
        // - Pedido D002: Latte con Chocolate tipo Leche + 2 azúcar
        // ----------------------------
        Cliente cliente3 = new Cliente("Daniela Ruiz", "daniela.r@mail.com", "3003000300");

        // Pedido D001
        PedidoCafe pedidoD1 = new PedidoCafe("D001", "2025-10-23", "App");
        Espresso espresso = new Espresso();
        espresso.activarDobleCarga();
        espresso.configurarExtraccion(28);
        // Leche entera para espresso + crema + caramelo
        Leche lecheEntera = new Leche(espresso, "Entera");
        lecheEntera.medirCantidad(80);
        lecheEntera.espumar();
        Crema cremaSobreEspresso = new Crema(lecheEntera);
        cremaSobreEspresso.batir();
        Caramelo carameloSobreEsp = new Caramelo(cremaSobreEspresso);
        carameloSobreEsp.ajustarDensidad(0.9);
        // preparar y agregar
        carameloSobreEsp.preparar();
        pedidoD1.agregarBebida(carameloSobreEsp);

        // Pedido D002
        PedidoCafe pedidoD2 = new PedidoCafe("D002", "2025-10-24", "Efectivo");
        Latte latte2 = new Latte();
        Leche lecheLatte2 = new Leche(latte2, "Entera");
        Chocolate chocoLatte2 = new Chocolate(lecheLatte2, "Leche");
        Azucar chocoLatte2Azucar = new Azucar(chocoLatte2, 2);
        // preparar y agregar
        chocoLatte2Azucar.preparar();
        pedidoD2.agregarBebida(chocoLatte2Azucar);

        cliente3.agregarPedido(pedidoD1);
        cliente3.agregarPedido(pedidoD2);

        // ----------------------------
        // CLIENTE 4: María López
        // - Pedido M001: Cappuccino con leche deslactosada + 3 azúcar + caramelo
        // ----------------------------
        Cliente cliente4 = new Cliente("Maria Lopez", "maria.l@mail.com", "3004000400");
        PedidoCafe pedidoM1 = new PedidoCafe("M001", "2025-10-24", "Tarjeta");

        Cappuccino capp2 = new Cappuccino();
        capp2.cambiarLeche("Deslactosada");
        Leche lecheDeslact = new Leche(capp2, "Deslactosada");
        Azucar cappLecheAzucar = new Azucar(lecheDeslact, 3);
        Caramelo cappConCaramelo = new Caramelo(cappLecheAzucar);
        // acciones
        cappLecheAzucar.ajustarCantidad(3);
        cappConCaramelo.calentar();
        cappConCaramelo.preparar();
        pedidoM1.agregarBebida(cappConCaramelo);

        cliente4.agregarPedido(pedidoM1);

        // ----------------------------
        // Mostrar historiales y totales por cliente (de arriba hacia abajo)
        // ----------------------------
        System.out.println("\n=== HISTORIAL CLIENTE 1 ===");
        cliente1.mostrarHistorial();
        double totalCliente1 = calcularTotalCliente(cliente1);
        System.out.println("Total gastado por " + cliente1.getNombre() + ": $" + String.format("%.2f", totalCliente1));

        System.out.println("\n=== HISTORIAL CLIENTE 2 ===");
        cliente2.mostrarHistorial();
        double totalCliente2 = calcularTotalCliente(cliente2);
        System.out.println("Total gastado por " + cliente2.getNombre() + ": $" + String.format("%.2f", totalCliente2));

        System.out.println("\n=== HISTORIAL CLIENTE 3 ===");
        cliente3.mostrarHistorial();
        double totalCliente3 = calcularTotalCliente(cliente3);
        System.out.println("Total gastado por " + cliente3.getNombre() + ": $" + String.format("%.2f", totalCliente3));

        System.out.println("\n=== HISTORIAL CLIENTE 4 ===");
        cliente4.mostrarHistorial();
        double totalCliente4 = calcularTotalCliente(cliente4);
        System.out.println("Total gastado por " + cliente4.getNombre() + ": $" + String.format("%.2f", totalCliente4));
    }

    // Método auxiliar para sumar totales de todos los pedidos de un cliente
    private static double calcularTotalCliente(Cliente c) {
        double suma = 0.0;
        for (PedidoCafe p : c.getPedidos()) {
            suma += p.calcularTotal();
        }
        return suma;
    }
}
