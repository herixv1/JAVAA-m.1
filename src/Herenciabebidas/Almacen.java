package Herenciabebidas;

public class Almacen {

    private Estanteria[] estanterias;
    private int numEstanterias;

    public Almacen(int numEstanterias, int capacidadPorEstanteria) {
        this.estanterias    = new Estanteria[numEstanterias];
        this.numEstanterias = numEstanterias;
        for (int i = 0; i < numEstanterias; i++) {
            estanterias[i] = new Estanteria(capacidadPorEstanteria);
        }
    }

    private boolean existeId(int id) {
        for (int i = 0; i < numEstanterias; i++) {
            Producto[] prods = estanterias[i].getProductos();
            for (int j = 0; j < estanterias[i].getCantidad(); j++) {
                if (prods[j].getId() == id) {
                    return true; 
                }
            }
        }
        return false; 
    }

    public void agregarProducto(Producto p, int numEstanteria) {
        if (numEstanteria < 0 || numEstanteria >= numEstanterias) {
            System.out.println("Numero de estanteria invalido.");
            return;
        }
        if (existeId(p.getId())) {
            System.out.println("ERROR: ID " + p.getId() + " ya existe. No se agrego.");
            return;
        }
        boolean ok = estanterias[numEstanteria].agregar(p);
        if (ok) {
            System.out.println("Producto '" + p.getDescripcion() + "' agregado a estanteria " + numEstanteria + ".");
        }
    }

    public void eliminarProducto(int id) {
        for (int i = 0; i < numEstanterias; i++) {
            Producto[] prods    = estanterias[i].getProductos();
            int        cantidad = estanterias[i].getCantidad();

            for (int j = 0; j < cantidad; j++) {
                if (prods[j].getId() == id) {
                    for (int k = j; k < cantidad - 1; k++) {
                        prods[k] = prods[k + 1];
                    }
                    prods[cantidad - 1] = null;
                    estanterias[i].reducirCantidad();

                    System.out.println("Producto con ID " + id + " eliminado.");
                    return; 
                }
            }
        }
        System.out.println("No se encontro producto con ID " + id + ".");
    }

    public double calcularValorTotal() {
        double total = 0;
        for (int i = 0; i < numEstanterias; i++) {
            Producto[] prods = estanterias[i].getProductos();
            for (int j = 0; j < estanterias[i].getCantidad(); j++) {
                total += prods[j].getPrecioFinal() * prods[j].getUnidadesExistencia();
            }
        }
        return total;
    }

    public double calcularValorPorMarca(String marca) {
        double total = 0;
        for (int i = 0; i < numEstanterias; i++) {
            Producto[] prods = estanterias[i].getProductos();
            for (int j = 0; j < estanterias[i].getCantidad(); j++) {
                if (prods[j].getMarca().equalsIgnoreCase(marca)) {
                    total += prods[j].getPrecioFinal() * prods[j].getUnidadesExistencia();
                }
            }
        }
        return total;
    }

    public void mostrarTodo() {
        System.out.println("========== ALMACEN ==========");
        for (int i = 0; i < numEstanterias; i++) {
            System.out.println("\n--- Estanteria " + i + " ---");
            int cantidad = estanterias[i].getCantidad();
            if (cantidad == 0) {
                System.out.println("  (vacia)");
            } else {
                Producto[] prods = estanterias[i].getProductos();
                for (int j = 0; j < cantidad; j++) {
                    prods[j].mostrarInfo();
                }
            }
        }
        System.out.println("==============================");
    }
}
