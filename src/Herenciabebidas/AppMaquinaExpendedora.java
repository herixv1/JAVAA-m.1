package Herenciabebidas;

public class AppMaquinaExpendedora {

    public static void main(String[] args) {


        Almacen almacen = new Almacen(3, 5);

        AguaMineral agua1 = new AguaMineral(1, "Agua Natural", 1.5, "litros",100, 0.60, "Aquarius", "Manantial Sierra Nevada");
        AguaMineral agua2 = new AguaMineral(2, "Agua con Gas", 0.5, "litros",80,  0.80, "Perrier",  "Manantial Vergeze Francia");
        BebidaAzucarada coca1 = new BebidaAzucarada(3, "Coca-Cola Original", 0.33, "litros",200, 1.20, "Coca-Cola", 10.6, true);
        BebidaAzucarada fanta = new BebidaAzucarada(4, "Fanta Naranja", 0.50, "litros", 150, 1.00, "Fanta",     8.3,  false);
        BebidaAzucarada coca2 = new BebidaAzucarada(5, "Coca-Cola Zero", 0.50, "litros", 120, 1.10, "Coca-Cola", 0.0,  true);

        System.out.println("=== AGREGANDO PRODUCTOS ===");
        almacen.agregarProducto(agua1, 0); 
        almacen.agregarProducto(agua2, 0);
        almacen.agregarProducto(coca1, 1);  
        almacen.agregarProducto(fanta, 1);
        almacen.agregarProducto(coca2, 2);

        AguaMineral duplicado = new AguaMineral(1, "Copia", 1.0, "litros",10, 0.50, "X", "Desconocido");
        almacen.agregarProducto(duplicado, 0);

        System.out.println("\n=== INFORMACION DEL ALMACEN ===");
        almacen.mostrarTodo();

        System.out.println("\n=== CALCULOS ===");
        double total = almacen.calcularValorTotal();
        System.out.printf("Valor total del almacen: %.2f €%n", total);

        double totalCoca = almacen.calcularValorPorMarca("Coca-Cola");
        System.out.printf("Valor total Coca-Cola: %.2f €%n", totalCoca);

        double totalFanta = almacen.calcularValorPorMarca("Fanta");
        System.out.printf("Valor total Fanta: %.2f €%n", totalFanta);

        System.out.println("\n=== ELIMINANDO PRODUCTO ID=4 (Fanta) ===");
        almacen.eliminarProducto(4);

        almacen.eliminarProducto(99);

        System.out.println("\n=== ALMACEN TRAS ELIMINAR ===");
        almacen.mostrarTodo();

        System.out.printf("%nValor total actualizado: %.2f €%n",almacen.calcularValorTotal());
    }
}
