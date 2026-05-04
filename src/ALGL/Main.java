package ALGL;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = -1;

        do {
            System.out.println("\n  calculadora de vectores");
            System.out.println("1. verificar si vectores forman una base");
            System.out.println("2. angulo entre dos vectores");
            System.out.println("0. salir");
            
            opcion = leerNum("opcion: ");

            switch (opcion) {
                case 1:
                    opcionBase();
                    break;
                case 2:
                    opcionAngulo();
                    break;
                case 0:
                    System.out.println("bye");
                    break;
                default:
                    System.out.println("opcion no valida eliga correctamente o salga del programa");
            }
        } while (opcion != 0);
    }

    public static int leerNum(String mensaje) {
        int numero = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                valido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Solo se aceptan numeros ingrese el numero correspondiente");
                scanner.nextLine();
            }
        }
        return numero;
    }

    public static double[] leerVector(int dim) {
        double[] vector = new double[dim];
        for (int i = 0; i < dim; i++) {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.print("  componente [" + i + "]: ");
                    vector[i] = scanner.nextDouble();
                    valido = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println(" Solo se aceptan numeros ingrese el numero correspondiente");
                    scanner.nextLine();
                }
            }
        }
        return vector;
    }

    public static void mostrarVector(double[] v) {
        System.out.print("( ");
        for (int i = 0; i < v.length; i++) {
            System.out.printf("%.2f", v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println(" )");
    }

public static void opcionBase() {
        System.out.println("");
        int dim = leerNum("dimension del espacio (R): ");
        int n = leerNum("cantidad de vectores: ");

        if (n != dim) {
            System.out.println("\nresultado: NO forman una base");
            System.out.println("razon: se necesitan exactamente " + dim + " vectores para R^" + dim);
            return;
        }
        double[][] vectores = new double[n][dim];

        for (int i = 0; i < n; i++) {
            System.out.println("vector v" + (i + 1) + ":");
            vectores[i] = leerVector(dim);
        }

        System.out.println("\n--- vectores ingresados ---");
        for (int i = 0; i < n; i++) {
            System.out.print("v" + (i + 1) + " = ");
            mostrarVector(vectores[i]);
        }

        boolean resultado = OPvector.esBase(vectores);
        System.out.println("\nresultado: los vectores " + (resultado ? "SI" : "NO") + " forman una base de R^" + dim);
        if (resultado) {
            System.out.println("los vectores son linealmente independientes y generan R^" + dim);
        } else {
            System.out.println("los vectores son linealmente dependientes");
        }
    }

    public static void opcionAngulo() {
        System.out.println("");
        int dim = leerNum("dimension de los vectores: ");
        System.out.println("vector u:");
        double[] u = leerVector(dim);
        System.out.println("vector v:");
        double[] v = leerVector(dim);

        System.out.print("\nu = ");
        mostrarVector(u);
        System.out.print("v = ");
        mostrarVector(v);

        try {
            double angulo = OPvector.anguloGrados(u, v);
            double coseno = OPvector.productoPunto(u, v) / (OPvector.norma(u) * OPvector.norma(v));

            System.out.printf("%nproducto punto (u . v): %.4f%n", OPvector.productoPunto(u, v));
            System.out.printf("norma de u: %.4f%n", OPvector.norma(u));
            System.out.printf("norma de v: %.4f%n", OPvector.norma(v));
            System.out.printf("cos(angulo): %.4f%n", coseno);
            System.out.printf("%nangulo: %.4f grados%n", angulo);
            System.out.printf("angulo: %.4f radianes%n", Math.toRadians(angulo));

            if (Math.abs(angulo - 90.0) < 0.001)
                System.out.println("los vectores son ortogonales");
            else if (angulo < 90.0)
                System.out.println("el angulo es agudo");
            else
                System.out.println("el angulo es obtuso");
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}