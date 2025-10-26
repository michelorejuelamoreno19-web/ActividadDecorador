public class Main {
    public static void main(String[] args) {
        // Cliente 1: Ana
        Cliente cliente1 = new Cliente("Ana Perez", "ana.perez@mail.com", "3001000100");
        PedidoCafe pedidoA1 = new PedidoCafe("A001", "2025-10-24", "Efectivo");
        Bebida espressoSimple = new Espresso();
        pedidoA1.agregarBebida(espressoSimple);
        Bebida latte = new Latte();
        Bebida latteConLeche = new Leche(latte, "Almendra");
        Bebida latteConLecheYAzu = new Azucar(latteConLeche, 1);
        pedidoA1.agregarBebida(latteConLecheYAzu);
        cliente1.agregarPedido(pedidoA1);
        ((Leche) latteConLeche).espumar();

        // Cliente 2: Carlos
        Cliente cliente2 = new Cliente("Carlos Gomez", "carlos.g@mail.com", "3002000200");
        PedidoCafe pedidoC1 = new PedidoCafe("C001", "2025-10-24", "Tarjeta");
        Bebida capp = new Cappuccino();
        Bebida cappAzucar = new Azucar(capp, 2);
        Bebida cappChoco = new Chocolate(cappAzucar, "Oscuro");
        Bebida cappChocoCrema = new Crema(cappChoco);
        pedidoC1.agregarBebida(cappChocoCrema);
        cliente2.agregarPedido(pedidoC1);
        ((Chocolate) cappChoco).derretir();

        // Cliente 3: Daniela
        Cliente cliente3 = new Cliente("Daniela Ruiz", "daniela.r@mail.com", "3003000300");
        PedidoCafe pedidoD1 = new PedidoCafe("D001", "2025-10-23", "App");
        Espresso espresso = new Espresso();
        espresso.activarDobleCarga();
        espresso.configurarExtraccion(28);
        Bebida espressoCaramelo = new Caramelo(new Crema(new Leche(espresso, "Entera")));
        pedidoD1.agregarBebida(espressoCaramelo);
        PedidoCafe pedidoD2 = new PedidoCafe("D002", "2025-10-24", "Efectivo");
        Bebida latte2 = new Latte();
        Bebida latte2Choco = new Chocolate(new Leche(latte2, "Entera"), "Leche");
        Bebida latte2ChocoAzucar = new Azucar(latte2Choco, 2);
        pedidoD2.agregarBebida(latte2ChocoAzucar);
        cliente3.agregarPedido(pedidoD1);
        cliente3.agregarPedido(pedidoD2);

        // Cliente 4: Maria
        Cliente cliente4 = new Cliente("Maria Lopez", "maria.l@mail.com", "3004000400");
        PedidoCafe pedidoM1 = new PedidoCafe("M001", "2025-10-24", "Tarjeta");
        Cappuccino capp2 = new Cappuccino();
        capp2.cambiarLeche("Deslactosada");
        Bebida cappM = new Azucar(new Leche(capp2, "Deslactosada"), 3);
        Bebida cappMCaramelo = new Caramelo(cappM);
        pedidoM1.agregarBebida(cappMCaramelo);
        cliente4.agregarPedido(pedidoM1);

        // Mostrar historiales
        System.out.println("=== HISTORIAL CLIENTE 1 ===");
        cliente1.mostrarHistorial();

        System.out.println("\n=== HISTORIAL CLIENTE 2 ===");
        cliente2.mostrarHistorial();

        System.out.println("\n=== HISTORIAL CLIENTE 3 ===");
        cliente3.mostrarHistorial();

        System.out.println("\n=== HISTORIAL CLIENTE 4 ===");
        cliente4.mostrarHistorial();

        // Ejemplo: mostrar resumen directos
        for (PedidoCafe p : cliente1.getPedidos()) {
            System.out.println("Resumen: " + p.getResumen());
        }
    }
}
