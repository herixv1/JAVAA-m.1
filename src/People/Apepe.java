package People;

import VectorG.Vector;
import java.util.Scanner;

public class Apepe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Persona> datos = new Vector<>(3);
        int opcion;

        Rventas empleado1 = new Rventas("CHOUNA", "JRT067","Nocturno", 1, 10);
        empleado1.setSueldo(1500.50);
        datos.add(empleado1);

        Mantenimiento empleado2 = new Mantenimiento("YELO", "KYLR061","Matutino", 2, 120f);
        empleado2.setSueldo(2000.00);
        datos.add(empleado2);

        do {
            System.out.println("\n---Administrador de empleados ---");
            System.out.println("1. Agregar nuevo empleado (Ventas)");
            System.out.println("2. Mostrar todos los empleados");
            System.out.println("3. Ordenar por Turno y Sueldo");
            System.out.println("4. Ordenar por Nombre");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el RFC: ");
                    String rfc = scanner.nextLine();
                    System.out.print("Ingresa el turno: ");
                    String turno = scanner.nextLine();
                    System.out.print("Ingresa el sueldo base: ");
                    double sueldo = scanner.nextDouble();
                    
                    Rventas nuevoEmpleado = new Rventas(nombre, rfc, turno, 3, 0);
                    nuevoEmpleado.setSueldo(sueldo);
                    System.out.println(datos.add(nuevoEmpleado));
                    break;
                    
                case 2:
                    System.out.println("\n--- Lista de empleados ---");
                    System.out.println(datos.toString());
                    break;
                    
                case 3:
                    datos.ordenar(Comparadores.PorTurnoYSueldo);
                    System.out.println("\nVector ordenado exitosamente por turno y sueldo :D");
                    break;
                    
                case 4:
                    datos.ordenar(Comparadores.PorNombre);
                    System.out.println("\nVector ordenado exitosamente por nombre :D");
                    break;
                    
                case 5:
                    System.out.println("Bay");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
