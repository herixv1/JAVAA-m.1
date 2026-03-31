package HerenciaMultimedia;

import java.util.Scanner;

public class Apperrona {

    static Scanner sc = new Scanner(System.in);
    static ListaMultimedia lista = new ListaMultimedia(10);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("selecciona una opcion: ");

            switch (opcion) {
                case 1:
                    agregarPelicula();
                    break;
                case 2:
                    agregarDisco();
                    break;
                case 3:
                    agregarMultimedia();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 5:
                    buscarPorTituloYAutor();
                    break;
                case 6:
                    obtenerPorPosicion();
                    break;
                case 7:
                    mostrarDuracionTotal();
                    break;
                case 8:
                    contarDiscosRock();
                    break;
                case 9:
                    contarPeliculasSinActriz();
                    break;
                case 10:
                    System.out.println("\nsaliendo del programa...");
                    break;
                default:
                    System.out.println("opcion no valida. intenta de nuevo.");
            }
        } while (opcion != 10);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n==============================");
        System.out.println("      lista multimedia");
        System.out.println("==============================");
        System.out.println("1.  agregar pelicula");
        System.out.println("2.  agregar disco");
        System.out.println("3.  agregar multimedia");
        System.out.println("4.  mostrar lista");
        System.out.println("5.  buscar por titulo y autor");
        System.out.println("6.  obtener por posicion");
        System.out.println("7.  duracion total de la lista");
        System.out.println("8.  contar discos de rock");
        System.out.println("9.  peliculas sin actriz principal");
        System.out.println("10. salir");
        System.out.println("==============================");
    }

    static void agregarPelicula() {
        System.out.println("\n--- agregar pelicula ---");
        System.out.print("titulo: ");
        String titulo = sc.nextLine();
        System.out.print("autor: ");
        String autor = sc.nextLine();
        Formato formato = leerFormato();
        double duracion = leerDecimal("duracion (min): ");
        System.out.print("actor principal (enter para omitir): ");
        String actor = sc.nextLine();
        if (actor.isEmpty()) actor = null;
        System.out.print("actriz principal (enter para omitir): ");
        String actriz = sc.nextLine();
        if (actriz.isEmpty()) actriz = null;

        Pelicula p = new Pelicula(titulo, autor, formato, duracion, actor, actriz);
        if (lista.add(p)) {
            System.out.println("pelicula agregada correctamente.");
        } else {
            System.out.println("la lista esta llena. no se pudo agregar.");
        }
    }

    static void agregarDisco() {
        System.out.println("\n--- agregar disco ---");
        System.out.print("titulo: ");
        String titulo = sc.nextLine();
        System.out.print("autor: ");
        String autor = sc.nextLine();
        Formato formato = leerFormato();
        double duracion = leerDecimal("duracion (min): ");
        Genero genero = leerGenero();

        Disco d = new Disco(titulo, autor, formato, duracion, genero);
        if (lista.add(d)) {
            System.out.println("disco agregado correctamente.");
        } else {
            System.out.println("la lista esta llena. no se pudo agregar.");
        }
    }

    static void agregarMultimedia() {
        System.out.println("\n--- agregar multimedia ---");
        System.out.print("titulo: ");
        String titulo = sc.nextLine();
        System.out.print("autor: ");
        String autor = sc.nextLine();
        Formato formato = leerFormato();
        double duracion = leerDecimal("duracion (min): ");

        Multimedia m = new Multimedia(titulo, autor, formato, duracion);
        if (lista.add(m)) {
            System.out.println("multimedia agregado correctamente.");
        } else {
            System.out.println("la lista esta llena. no se pudo agregar.");
        }
    }

    static void mostrarLista() {
        System.out.println("\n--- contenido de la lista ---");
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia.");
        } else {
            System.out.println("total de elementos: " + lista.size());
            System.out.println(lista.toString());
        }
    }

    static void buscarPorTituloYAutor() {
        System.out.println("\n--- buscar por titulo y autor ---");
        System.out.print("titulo: ");
        String titulo = sc.nextLine();
        System.out.print("autor: ");
        String autor = sc.nextLine();

        Multimedia buscado = new Multimedia(titulo, autor, Formato.mp3, 0);
        int posicion = lista.indexOf(buscado);

        if (posicion == -1) {
            System.out.println("no se encontro ningun objeto con ese titulo y autor.");
        } else {
            System.out.println("objeto encontrado en posicion: " + posicion);
            System.out.println(lista.get(posicion).toString());
        }
    }

    static void obtenerPorPosicion() {
        System.out.println("\n--- obtener por posicion ---");
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia.");
            return;
        }
        int posicion = leerEntero("posicion (0 a " + (lista.size() - 1) + "): ");
        Multimedia obj = lista.get(posicion);
        if (obj != null) {
            System.out.println("posicion [" + posicion + "]: " + obj.toString());
        }
    }

    static void mostrarDuracionTotal() {
        System.out.println("\n--- duracion total ---");
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia.");
            return;
        }
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getDuracion();
        }
        System.out.println("duracion total de los " + lista.size() + " objetos: " + total + " min");
    }

    static void contarDiscosRock() {
        System.out.println("\n--- discos de rock ---");
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia.");
            return;
        }
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Disco) {
                Disco disco = (Disco) lista.get(i);
                if (disco.getGenero() == Genero.rock) {
                    contador++;
                }
            }
        }
        System.out.println("total de discos de rock en la lista: " + contador);
    }

    static void contarPeliculasSinActriz() {
        System.out.println("\n--- peliculas sin actriz principal ---");
        if (lista.size() == 0) {
            System.out.println("la lista esta vacia.");
            return;
        }
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Pelicula) {
                Pelicula pelicula = (Pelicula) lista.get(i);
                if (pelicula.getActrizPrincipal() == null) {
                    contador++;
                }
            }
        }
        System.out.println("total de peliculas sin actriz principal: " + contador);
    }

    static Formato leerFormato() {
        System.out.println("formatos disponibles: wav | mp3 | midi | avi | mov | mpg | claudio | dvd");
        while (true) {
            System.out.print("formato: ");
            String entrada = sc.nextLine().trim().toLowerCase();
            try {
                return Formato.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("formato no valido. intenta de nuevo.");
            }
        }
    }

    static Genero leerGenero() {
        System.out.println("generos disponibles: rock | pop | funky | flamenco | clasico | blues | tecno | ambiente | punk | jazz | hiphop");
        while (true) {
            System.out.print("genero: ");
            String entrada = sc.nextLine().trim().toLowerCase();
            try {
                return Genero.valueOf(entrada);
            } catch (IllegalArgumentException e) {
                System.out.println("genero no valido. intenta de nuevo.");
            }
        }
    }

    static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("entrada no valida. ingresa un numero entero.");
            }
        }
    }

    static double leerDecimal(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                double valor = Double.parseDouble(sc.nextLine().trim());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("entrada no valida. ingresa un numero.");
            }
        }
    }
}