package Herenciabebidas;

import java.util.Scanner;

public class AppMaquinaExpendedora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Almacen almacen = new Almacen(5, 10);
        int opcion;

        do {
            System.out.println("\n-----------------------------");
            System.out.println("     Almacén de Bebidas      ");
            System.out.println("-----------------------------");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("4. Valor total del almacén");
            System.out.println("5. Valor total por marca");
            System.out.println("0. Salir");
            System.out.println("-----------------------------");

            opcion = leerInt("Opción: ");

            switch (opcion) {
                case 1 -> agregarProducto(almacen);
                case 2 -> {
                    int id = leerInt("ID a eliminar: ");
                    almacen.eliminarProducto(id);
                }
                case 3 -> almacen.mostrarTodo();
                case 4 -> System.out.printf("Valor total: %.2f EUR%n", almacen.calcularValorTotal());
                case 5 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine().trim();
                    System.out.printf("Valor total de '%s': %.2f EUR%n", marca, almacen.calcularValorPorMarca(marca));
                }
                case 0 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    static void agregarProducto(Almacen almacen) {
        System.out.println("\n1. Agua Mineral");
        System.out.println("2. Bebida Azucarada");
        int tipo = leerInt("Tipo: ");

        if (tipo != 1 && tipo != 2) {
            System.out.println("Tipo no válido.");
            return;
        }

        int id = leerInt("ID: ");
        System.out.print("Descripción: ");
        String desc = sc.nextLine().trim();
        double tamanio = leerDouble("Tamaño (ej: 1.5): ");
        System.out.print("Unidad (ej: litros): ");
        String unidad = sc.nextLine().trim();
        int existencia = leerInt("Unidades en existencia: ");
        double precio = leerDouble("Precio: ");
        System.out.print("Marca: ");
        String marca = sc.nextLine().trim();
        int estanteria = leerInt("Número de estantería (0-4): ");

        if (tipo == 1) {
            System.out.print("Origen: ");
            String origen = sc.nextLine().trim();
            almacen.agregarProducto(
                new AguaMineral(id, desc, tamanio, unidad, existencia, precio, marca, origen),
                estanteria
            );
        } else {
            double porcentaje = leerDouble("Porcentaje de azúcar: ");
            int promo = leerInt("¿Tiene promoción? (1=Sí, 0=No): ");
            almacen.agregarProducto(
                new BebidaAzucarada(id, desc, tamanio, unidad, existencia, precio, marca, porcentaje, promo == 1),
                estanteria
            );
        }
    }

    static int leerInt(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número entero.");
            }
        }
    }

    static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número decimal.");
            }
        }
    }
}