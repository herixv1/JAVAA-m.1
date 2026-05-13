package Excepciones;

import java.util.Scanner;

public class APePe {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Curso curso = new Curso("POO", "Programacion Orientada a Objetos", 3);

                int opcion = 0;

                do {
                        System.out.println("\n  SISTEMA DE GESTION DE INSCRIPCIONES");
                        System.out.println("==========================================");
                        System.out.println("Curso actual: " + curso.getNombre() + " (" + curso.getClave() + ")");
                        System.out.println("Cupo maximo: " + curso.getCupoMaximo());
                        System.out.println("------------------------------------------");
                        System.out.println("1. Inscribir nuevo estudiante");
                        System.out.println("2. Mostrar estudiantes inscritos");
                        System.out.println("3. Salir");
                        System.out.print("Seleccione una opcion: ");

                        try {
                                opcion = Integer.parseInt(scanner.nextLine());

                                switch (opcion) {
                                        case 1:
                                                System.out.println("\n--- DATOS DEL ESTUDIANTE ---");

                                                try {
                                                        System.out.print("Ingrese matricula: ");
                                                        String matricula = scanner.nextLine();

                                                        System.out.print("Ingrese nombre: ");
                                                        String nombre = scanner.nextLine();

                                                        System.out.print("Ingrese promedio: ");
                                                        double promedio = Double.parseDouble(scanner.nextLine());

                                                        Estudiantes nuevoEstudiante = new Estudiantes(matricula, nombre,
                                                                        promedio);
                                                        try {
                                                                curso.inscribir(nuevoEstudiante);
                                                        } catch (InscripcionException e) {
                                                                System.out.println( "\n" + e.getMessage());
                                                        }

                                                } catch (NumberFormatException e) {
                                                        System.out.println("\n Solo debes ingresar numeros");
                                                } catch (Exception e) {
                                                        System.out.println(
                                                                        "\nError inesperado al procesar los datos del estudiante.");
                                                }

                                                break;

                                        case 2:
                                                System.out.println("\n--- LISTA DE ESTUDIANTES INSCRITOS ---");
                                                curso.mostrarInscritos();
                                                break;

                                        case 3:
                                                System.out.println("\nSaliendo...");
                                                break;

                                        default:
                                                System.out.println("\nOpcion no valida. Seleccione 1, 2 o 3.");
                                }

                        } catch (NumberFormatException e) {
                                System.out.println("\nError: Solo ingresar numeros en el menu principal.");
                        } catch (Exception e) {
                                System.out.println("\nOcurrio un error inesperado: " + e.getMessage());
                        }

                } while (opcion != 3);

                scanner.close();
        }
}
